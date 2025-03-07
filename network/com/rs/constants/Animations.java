package com.rs.constants;

import com.rs.net.encoders.other.Animation;

/**
 * A collection of useful type-safe Animations designed to provide better
 * readability and code base flow.
 * 
 * TODO: Summoning, Skillcape, Combat/Magic animations (combat needs rework, so it can be left alone)
 * 
 * @author Dennis
 *
 */
public final class Animations {

	
	public static final Animation RESET_ANIMATION = new Animation(-1);
	
	/**
	 * Player Based Animations
	 */
	public static final Animation YES = new Animation(855);
	public static final Animation NO = new Animation(856);
	public static final Animation BOW_DOWN = new Animation(858);
	public static final Animation ANGRY = new Animation(859);
	public static final Animation THINKING = new Animation(857);
	public static final Animation WAVE = new Animation(863);
	public static final Animation SHRUG = new Animation(2113);
	public static final Animation CHEER = new Animation(862);
	public static final Animation BECKON = new Animation(864);
	public static final Animation LAUGH = new Animation(861);
	public static final Animation JUMP_FOR_JOY = new Animation(2109);
	public static final Animation YAWN = new Animation(2111);
	public static final Animation DANCE = new Animation(866);
	public static final Animation JIG = new Animation(2106);
	public static final Animation TWIRL = new Animation(2107);
	public static final Animation HEAD_BANG = new Animation(2108);
	public static final Animation CRY = new Animation(861);
	public static final Animation BLOW_KISS = new Animation(1374);
	public static final Animation PANIC = new Animation(2105);
	public static final Animation RASPBERRY = new Animation(2110);
	public static final Animation CLAP = new Animation(865);
	public static final Animation SALUTE = new Animation(2112);
	public static final Animation GOBLIN_BOW = new Animation(0x84F);
	public static final Animation GOBLIN_SALUTE = new Animation(0x850);
	public static final Animation GLASS_BOX = new Animation(1131);
	public static final Animation CLIMB_ROPE = new Animation(1130);
	public static final Animation LEAN = new Animation(1129);
	public static final Animation GLASS_WALL = new Animation(1128);
	public static final Animation IDEA = new Animation(4276);
	public static final Animation STOMP = new Animation(1745);
	public static final Animation FLAP = new Animation(2112);
	public static final Animation SLAP_HEAD = new Animation(4275);
	public static final Animation ZOMBIE_WALK = new Animation(3544);
	public static final Animation ZOMBIE_DANCE = new Animation(3543);
	public static final Animation ZOMBIE_HAND = new Animation(7272);
	public static final Animation SCARED = new Animation(2836);
	public static final Animation BUNNY_HOP = new Animation(6111);
	//TODO: Skillcapes (Doesn't exist yet)
	public static final Animation SNOWMAN_DANCE = new Animation(7531);
	public static final Animation AIR_GUITAR = new Animation(2414);
	public static final Animation SAFETY_FIRST = new Animation(8770);
	public static final Animation EXPLORE = new Animation(9990);
	public static final Animation TRICK = new Animation(10530);
	public static final Animation FREEZE = new Animation(11044);
	public static final Animation TURKEY_PART_1 = new Animation(10994);
	public static final Animation TURKEY_PART_2 = new Animation(10996);
	public static final Animation TURKEY_PART_3 = new Animation(10995);
	public static final Animation AROUND_THE_WORLD_IN_EGGTY_DAYS = new Animation(11542);
	public static final Animation DRAMATIC_POINT = new Animation(12658);
	public static final Animation FAINT = new Animation(14165);
	public static final Animation PUPPET_MASTER = new Animation(14869);
	public static final Animation TASK_MASTER = new Animation(15033);
	public static final Animation BREAK_TELETAB = new Animation(9597);
	public static final Animation TELE_TAB_SINK_INWARDS = new Animation(4731);
	public static final Animation CURSES_PROTECT_ITEM = new Animation(12567);
	public static final Animation CURSES_BUFF = new Animation(12589);
	public static final Animation CURSES_TURMOIL = new Animation(12565);
	public static final Animation EMPTY_ECTOPHIAL = new Animation(9609);
	public static final Animation TOUCH_GROUND = new Animation(827);
	public static final Animation JUMP = new Animation(6132);
	public static final Animation TELEPORT_NORMAL = new Animation(8939);
	public static final Animation TELEPORT_ANCIENT = new Animation(9599);
	public static final Animation TELEPORT_LUNAR = new Animation(9606);
	public static final Animation TELEPORT_LEVER = new Animation(8939);
	public static final Animation TELEPORT_NORMAL_RETURN = new Animation(8941);
	public static final Animation LADDER_CLIMB = new Animation(828);
	public static final Animation KNOCKING_ON_DOOR = new Animation(9105);
	public static final Animation FADE_AWAY = new Animation(10100);
	public static final Animation FADE_BACK_IN = new Animation(9013);
	public static final Animation LEAP_INTO_AIR = new Animation(9602);
	public static final Animation DEATH_FALLING = new Animation(836);
	public static final Animation CONSUMING_ITEM = new Animation(829);
	public static final Animation NET_FISHING = new Animation(621);
	public static final Animation BIG_NET_FISHING = new Animation(620);
	public static final Animation FISHING_ROD = new Animation(622);
	public static final Animation HARPOON = new Animation(618);
	public static final Animation LOBSTER_POT = new Animation(619);
	public static final Animation PICKPOCKET = new Animation(881);
	public static final Animation PICKPOCKET_STUN = new Animation(424);
	public static final Animation OVERLOAD = new Animation(3170);
	public static final Animation RUNECRAFTING = new Animation(791);
	public static final Animation PRAYING_TO_ALTAR = new Animation(645);
	public static final Animation TWO_HANDED_GRAB = new Animation(881);
	public static final Animation SIMPLE_GRAB = new Animation(536);
	public static final Animation BONE_ON_ALTAR = new Animation(713);
	public static final Animation BAKE_PIE_SPELL = new Animation(4413);
	public static final Animation COOKING_ON_FIRE = new Animation(897);
	public static final Animation COOKING_ON_STOVE = new Animation(897);
	public static final Animation ATTEMPT_FIRE_LIGHTING = new Animation(733);
	public static final Animation SPADE_DIG = new Animation(830);
	public static final Animation CAST_BLOOM = new Animation(9104);
	public static final Animation COW_MILKING = new Animation(2305);
	//Fletching animations are not archived. Seems a bit much to do for simplicity sake
	public static final Animation BOLT_CREATION = new Animation(6702);
	public static final Animation CRAYFISH_FISHING = new Animation(10009);
	public static final Animation VESSEL_FISHING = new Animation(1193);
	public static final Animation ITEM_SPELL_CONVERTING = new Animation(722);
	public static final Animation CHARGE_SPELL = new Animation(811);
	public static final Animation DROP_SOMETHING_SLOWLY = new Animation(8908);
	public static final Animation PLACING_SOMETHING_OVERHEAD = new Animation(12398);
	public static final Animation CRYSTAL_SAW_SAWING = new Animation(12382);
	public static final Animation REGULAR_SAWING = new Animation(12379);
	public static final Animation CHARGE_ORB = new Animation(726);
	public static final Animation TELEGRAB_SPELL = new Animation(711);
	public static final Animation TREE_PICKING = new Animation(2280);
	public static final Animation BUCKET_SCOOPING = new Animation(895);
	public static final Animation KNIFE_SLASHING_WEB = new Animation(911);
	public static final Animation JUMPING_INTO_SOMETHING = new Animation(7269);
	
	/**
	 * Object Based Animations
	 */
	public static final Animation WILDERNESS_OBELISK = new Animation(2226);
	
	/**
	 * NPC Based Animations
	 */
	public static final Animation NPC_PICKPOCKET_FAIL_RESPONSE = new Animation(422);
	public static final Animation WIZARD_ESSENCE_MINE_TELEPORT = new Animation(1818);
}