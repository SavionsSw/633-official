package com.rs.game.system.scripts.context;

import java.util.Arrays;

import com.rs.game.dialogue.Expression;
import com.rs.game.player.Player;
import com.rs.game.system.scripts.ParamCall;
import com.rs.game.system.scripts.ScriptCompiler;
import com.rs.game.system.scripts.ScriptContext;

/**
 * Player dialogue instruction.
 * @author Emperor
 *
 */
public class PDialInstruction extends ScriptContext {

	/**
	 * The messages.
	 */
	private final String[] messages;

	/**
	 * The facial expression.
	 */
	private final int expression;

	/**
	 * If the continue option should be hidden.
	 */
	private boolean hideContinue;

	/**
	 * Constructs a new {@code PDialInstruction} {@code Object}.
	 */
	public PDialInstruction() {
		this(null, -1);
	}

	/**
	 * Constructs a new {@code PDialInstruction} {@code Object}.
	 * @param messages The messages.
	 * @param expression The facial expression animation id.
	 */
	public PDialInstruction(String[] messages, int expression) {
		super("player");
		super.setInstant(false);
		this.messages = messages;
		this.expression = expression;
	}

	@Override	//Arguments should be [player, npc]!
	public boolean execute(Object... args) {
		Player player = (Player) args[0]; //1 = NPC
		String[] messages = new String[this.messages.length];
		for (int i = 0; i < messages.length; i++) {
			String message = this.messages[i];
			if (message.contains(">playername<")) {
				message = message.replace(">playername<", player.getUsername());
			}
			messages[i] = message;
		}
		player.getDialogueInterpreter().sendEntityDialogue(player, expression, hideContinue, messages);
		player.getDialogueInterpreter().setDialogueStage(this);
		return true;
	}

	@Override
	public ScriptContext parse(Object... params) {
		String[] messages = new String[6];
		int messageIndex = 0;
		int expression = Expression.plain_talking;
		boolean hide = false;
		for (int i = 0; i < params.length; i++) {
			Object o = params[i];
			if (o instanceof ParamCall) {
				String param = ((ParamCall) o).getParameter();
				if (param.startsWith("anim:")) {
					String expr = ScriptCompiler.formatArgument(param.substring("anim:".length())).toString();
					expression = Integer.parseInt(expr);
				}
				else if (param.startsWith("hidecont:")) {
					hide = Boolean.parseBoolean(ScriptCompiler.formatArgument(param.substring("hidecont:".length())).toString());
				}
				else {
					messages[messageIndex++] = param;
				}
			} else if (o instanceof String) {
				messages[messageIndex++] = (String) o;
			}
		}
		if (messageIndex != messages.length) {
			messages = Arrays.copyOf(messages, messageIndex);
		}
		PDialInstruction context = new PDialInstruction(messages, expression);
		context.hideContinue = hide;
		context.parameters = params;
		return context;
	}

}