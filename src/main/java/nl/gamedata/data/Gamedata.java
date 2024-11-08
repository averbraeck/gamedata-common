/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data;


import java.util.Arrays;
import java.util.List;

import nl.gamedata.data.tables.DashboardSetting;
import nl.gamedata.data.tables.Game;
import nl.gamedata.data.tables.GameMission;
import nl.gamedata.data.tables.GameRole;
import nl.gamedata.data.tables.GameSession;
import nl.gamedata.data.tables.GameVersion;
import nl.gamedata.data.tables.Group;
import nl.gamedata.data.tables.GroupEvent;
import nl.gamedata.data.tables.GroupLogdata;
import nl.gamedata.data.tables.GroupRole;
import nl.gamedata.data.tables.GroupScore;
import nl.gamedata.data.tables.MissionEvent;
import nl.gamedata.data.tables.MissionLogdata;
import nl.gamedata.data.tables.Organization;
import nl.gamedata.data.tables.Player;
import nl.gamedata.data.tables.PlayerAttempt;
import nl.gamedata.data.tables.PlayerEvent;
import nl.gamedata.data.tables.PlayerLogdata;
import nl.gamedata.data.tables.PlayerScore;
import nl.gamedata.data.tables.Token;
import nl.gamedata.data.tables.User;
import nl.gamedata.data.tables.UserRole;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Gamedata extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>gamedata</code>
     */
    public static final Gamedata GAMEDATA = new Gamedata();

    /**
     * The table <code>gamedata.dashboard_setting</code>.
     */
    public final DashboardSetting DASHBOARD_SETTING = DashboardSetting.DASHBOARD_SETTING;

    /**
     * The table <code>gamedata.game</code>.
     */
    public final Game GAME = Game.GAME;

    /**
     * The table <code>gamedata.game_mission</code>.
     */
    public final GameMission GAME_MISSION = GameMission.GAME_MISSION;

    /**
     * The table <code>gamedata.game_role</code>.
     */
    public final GameRole GAME_ROLE = GameRole.GAME_ROLE;

    /**
     * The table <code>gamedata.game_session</code>.
     */
    public final GameSession GAME_SESSION = GameSession.GAME_SESSION;

    /**
     * The table <code>gamedata.game_version</code>.
     */
    public final GameVersion GAME_VERSION = GameVersion.GAME_VERSION;

    /**
     * The table <code>gamedata.group</code>.
     */
    public final Group GROUP = Group.GROUP;

    /**
     * The table <code>gamedata.group_event</code>.
     */
    public final GroupEvent GROUP_EVENT = GroupEvent.GROUP_EVENT;

    /**
     * The table <code>gamedata.group_logdata</code>.
     */
    public final GroupLogdata GROUP_LOGDATA = GroupLogdata.GROUP_LOGDATA;

    /**
     * The table <code>gamedata.group_role</code>.
     */
    public final GroupRole GROUP_ROLE = GroupRole.GROUP_ROLE;

    /**
     * The table <code>gamedata.group_score</code>.
     */
    public final GroupScore GROUP_SCORE = GroupScore.GROUP_SCORE;

    /**
     * The table <code>gamedata.mission_event</code>.
     */
    public final MissionEvent MISSION_EVENT = MissionEvent.MISSION_EVENT;

    /**
     * The table <code>gamedata.mission_logdata</code>.
     */
    public final MissionLogdata MISSION_LOGDATA = MissionLogdata.MISSION_LOGDATA;

    /**
     * The table <code>gamedata.organization</code>.
     */
    public final Organization ORGANIZATION = Organization.ORGANIZATION;

    /**
     * The table <code>gamedata.player</code>.
     */
    public final Player PLAYER = Player.PLAYER;

    /**
     * The table <code>gamedata.player_attempt</code>.
     */
    public final PlayerAttempt PLAYER_ATTEMPT = PlayerAttempt.PLAYER_ATTEMPT;

    /**
     * The table <code>gamedata.player_event</code>.
     */
    public final PlayerEvent PLAYER_EVENT = PlayerEvent.PLAYER_EVENT;

    /**
     * The table <code>gamedata.player_logdata</code>.
     */
    public final PlayerLogdata PLAYER_LOGDATA = PlayerLogdata.PLAYER_LOGDATA;

    /**
     * The table <code>gamedata.player_score</code>.
     */
    public final PlayerScore PLAYER_SCORE = PlayerScore.PLAYER_SCORE;

    /**
     * The table <code>gamedata.token</code>.
     */
    public final Token TOKEN = Token.TOKEN;

    /**
     * The table <code>gamedata.user</code>.
     */
    public final User USER = User.USER;

    /**
     * The table <code>gamedata.user_role</code>.
     */
    public final UserRole USER_ROLE = UserRole.USER_ROLE;

    /**
     * No further instances allowed
     */
    private Gamedata() {
        super("gamedata", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            DashboardSetting.DASHBOARD_SETTING,
            Game.GAME,
            GameMission.GAME_MISSION,
            GameRole.GAME_ROLE,
            GameSession.GAME_SESSION,
            GameVersion.GAME_VERSION,
            Group.GROUP,
            GroupEvent.GROUP_EVENT,
            GroupLogdata.GROUP_LOGDATA,
            GroupRole.GROUP_ROLE,
            GroupScore.GROUP_SCORE,
            MissionEvent.MISSION_EVENT,
            MissionLogdata.MISSION_LOGDATA,
            Organization.ORGANIZATION,
            Player.PLAYER,
            PlayerAttempt.PLAYER_ATTEMPT,
            PlayerEvent.PLAYER_EVENT,
            PlayerLogdata.PLAYER_LOGDATA,
            PlayerScore.PLAYER_SCORE,
            Token.TOKEN,
            User.USER,
            UserRole.USER_ROLE
        );
    }
}
