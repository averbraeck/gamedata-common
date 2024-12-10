/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data;


import nl.gamedata.data.tables.AccessToken;
import nl.gamedata.data.tables.Dashboard;
import nl.gamedata.data.tables.DashboardElement;
import nl.gamedata.data.tables.DashboardLayout;
import nl.gamedata.data.tables.DashboardRole;
import nl.gamedata.data.tables.DashboardSession;
import nl.gamedata.data.tables.DashboardTemplate;
import nl.gamedata.data.tables.DashboardToken;
import nl.gamedata.data.tables.ElementProperty;
import nl.gamedata.data.tables.Game;
import nl.gamedata.data.tables.GameAccess;
import nl.gamedata.data.tables.GameAccessRole;
import nl.gamedata.data.tables.GameMission;
import nl.gamedata.data.tables.GameRole;
import nl.gamedata.data.tables.GameSession;
import nl.gamedata.data.tables.GameToken;
import nl.gamedata.data.tables.GameVersion;
import nl.gamedata.data.tables.Group;
import nl.gamedata.data.tables.GroupAttempt;
import nl.gamedata.data.tables.GroupEvent;
import nl.gamedata.data.tables.GroupObjective;
import nl.gamedata.data.tables.GroupRole;
import nl.gamedata.data.tables.GroupScore;
import nl.gamedata.data.tables.LearningGoal;
import nl.gamedata.data.tables.MissionEvent;
import nl.gamedata.data.tables.Organization;
import nl.gamedata.data.tables.OrganizationRole;
import nl.gamedata.data.tables.Player;
import nl.gamedata.data.tables.PlayerAttempt;
import nl.gamedata.data.tables.PlayerEvent;
import nl.gamedata.data.tables.PlayerObjective;
import nl.gamedata.data.tables.PlayerScore;
import nl.gamedata.data.tables.PropertyValue;
import nl.gamedata.data.tables.Scale;
import nl.gamedata.data.tables.SessionRole;
import nl.gamedata.data.tables.TemplateElement;
import nl.gamedata.data.tables.User;


/**
 * Convenience access to all tables in gamedata.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>gamedata.access_token</code>.
     */
    public static final AccessToken ACCESS_TOKEN = AccessToken.ACCESS_TOKEN;

    /**
     * The table <code>gamedata.dashboard</code>.
     */
    public static final Dashboard DASHBOARD = Dashboard.DASHBOARD;

    /**
     * The table <code>gamedata.dashboard_element</code>.
     */
    public static final DashboardElement DASHBOARD_ELEMENT = DashboardElement.DASHBOARD_ELEMENT;

    /**
     * The table <code>gamedata.dashboard_layout</code>.
     */
    public static final DashboardLayout DASHBOARD_LAYOUT = DashboardLayout.DASHBOARD_LAYOUT;

    /**
     * The table <code>gamedata.dashboard_role</code>.
     */
    public static final DashboardRole DASHBOARD_ROLE = DashboardRole.DASHBOARD_ROLE;

    /**
     * The table <code>gamedata.dashboard_session</code>.
     */
    public static final DashboardSession DASHBOARD_SESSION = DashboardSession.DASHBOARD_SESSION;

    /**
     * The table <code>gamedata.dashboard_template</code>.
     */
    public static final DashboardTemplate DASHBOARD_TEMPLATE = DashboardTemplate.DASHBOARD_TEMPLATE;

    /**
     * The table <code>gamedata.dashboard_token</code>.
     */
    public static final DashboardToken DASHBOARD_TOKEN = DashboardToken.DASHBOARD_TOKEN;

    /**
     * The table <code>gamedata.element_property</code>.
     */
    public static final ElementProperty ELEMENT_PROPERTY = ElementProperty.ELEMENT_PROPERTY;

    /**
     * The table <code>gamedata.game</code>.
     */
    public static final Game GAME = Game.GAME;

    /**
     * The table <code>gamedata.game_access</code>.
     */
    public static final GameAccess GAME_ACCESS = GameAccess.GAME_ACCESS;

    /**
     * The table <code>gamedata.game_access_role</code>.
     */
    public static final GameAccessRole GAME_ACCESS_ROLE = GameAccessRole.GAME_ACCESS_ROLE;

    /**
     * The table <code>gamedata.game_mission</code>.
     */
    public static final GameMission GAME_MISSION = GameMission.GAME_MISSION;

    /**
     * The table <code>gamedata.game_role</code>.
     */
    public static final GameRole GAME_ROLE = GameRole.GAME_ROLE;

    /**
     * The table <code>gamedata.game_session</code>.
     */
    public static final GameSession GAME_SESSION = GameSession.GAME_SESSION;

    /**
     * The table <code>gamedata.game_token</code>.
     */
    public static final GameToken GAME_TOKEN = GameToken.GAME_TOKEN;

    /**
     * The table <code>gamedata.game_version</code>.
     */
    public static final GameVersion GAME_VERSION = GameVersion.GAME_VERSION;

    /**
     * The table <code>gamedata.group</code>.
     */
    public static final Group GROUP = Group.GROUP;

    /**
     * The table <code>gamedata.group_attempt</code>.
     */
    public static final GroupAttempt GROUP_ATTEMPT = GroupAttempt.GROUP_ATTEMPT;

    /**
     * The table <code>gamedata.group_event</code>.
     */
    public static final GroupEvent GROUP_EVENT = GroupEvent.GROUP_EVENT;

    /**
     * The table <code>gamedata.group_objective</code>.
     */
    public static final GroupObjective GROUP_OBJECTIVE = GroupObjective.GROUP_OBJECTIVE;

    /**
     * The table <code>gamedata.group_role</code>.
     */
    public static final GroupRole GROUP_ROLE = GroupRole.GROUP_ROLE;

    /**
     * The table <code>gamedata.group_score</code>.
     */
    public static final GroupScore GROUP_SCORE = GroupScore.GROUP_SCORE;

    /**
     * The table <code>gamedata.learning_goal</code>.
     */
    public static final LearningGoal LEARNING_GOAL = LearningGoal.LEARNING_GOAL;

    /**
     * The table <code>gamedata.mission_event</code>.
     */
    public static final MissionEvent MISSION_EVENT = MissionEvent.MISSION_EVENT;

    /**
     * The table <code>gamedata.organization</code>.
     */
    public static final Organization ORGANIZATION = Organization.ORGANIZATION;

    /**
     * The table <code>gamedata.organization_role</code>.
     */
    public static final OrganizationRole ORGANIZATION_ROLE = OrganizationRole.ORGANIZATION_ROLE;

    /**
     * The table <code>gamedata.player</code>.
     */
    public static final Player PLAYER = Player.PLAYER;

    /**
     * The table <code>gamedata.player_attempt</code>.
     */
    public static final PlayerAttempt PLAYER_ATTEMPT = PlayerAttempt.PLAYER_ATTEMPT;

    /**
     * The table <code>gamedata.player_event</code>.
     */
    public static final PlayerEvent PLAYER_EVENT = PlayerEvent.PLAYER_EVENT;

    /**
     * The table <code>gamedata.player_objective</code>.
     */
    public static final PlayerObjective PLAYER_OBJECTIVE = PlayerObjective.PLAYER_OBJECTIVE;

    /**
     * The table <code>gamedata.player_score</code>.
     */
    public static final PlayerScore PLAYER_SCORE = PlayerScore.PLAYER_SCORE;

    /**
     * The table <code>gamedata.property_value</code>.
     */
    public static final PropertyValue PROPERTY_VALUE = PropertyValue.PROPERTY_VALUE;

    /**
     * The table <code>gamedata.scale</code>.
     */
    public static final Scale SCALE = Scale.SCALE;

    /**
     * The table <code>gamedata.session_role</code>.
     */
    public static final SessionRole SESSION_ROLE = SessionRole.SESSION_ROLE;

    /**
     * The table <code>gamedata.template_element</code>.
     */
    public static final TemplateElement TEMPLATE_ELEMENT = TemplateElement.TEMPLATE_ELEMENT;

    /**
     * The table <code>gamedata.user</code>.
     */
    public static final User USER = User.USER;
}
