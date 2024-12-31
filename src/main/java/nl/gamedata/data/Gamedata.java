/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data;


import java.util.Arrays;
import java.util.List;

import nl.gamedata.data.tables.Dashboard;
import nl.gamedata.data.tables.DashboardElement;
import nl.gamedata.data.tables.DashboardLayout;
import nl.gamedata.data.tables.DashboardRole;
import nl.gamedata.data.tables.DashboardSession;
import nl.gamedata.data.tables.DashboardTemplate;
import nl.gamedata.data.tables.DashboardToken;
import nl.gamedata.data.tables.ElementProperty;
import nl.gamedata.data.tables.Error;
import nl.gamedata.data.tables.Game;
import nl.gamedata.data.tables.GameMission;
import nl.gamedata.data.tables.GameRole;
import nl.gamedata.data.tables.GameSession;
import nl.gamedata.data.tables.GameSessionRole;
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
import nl.gamedata.data.tables.OrganizationGame;
import nl.gamedata.data.tables.OrganizationGameRole;
import nl.gamedata.data.tables.OrganizationGameToken;
import nl.gamedata.data.tables.OrganizationRole;
import nl.gamedata.data.tables.Player;
import nl.gamedata.data.tables.PlayerAttempt;
import nl.gamedata.data.tables.PlayerEvent;
import nl.gamedata.data.tables.PlayerObjective;
import nl.gamedata.data.tables.PlayerScore;
import nl.gamedata.data.tables.PropertyValue;
import nl.gamedata.data.tables.Scale;
import nl.gamedata.data.tables.TemplateElement;
import nl.gamedata.data.tables.User;

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
     * The table <code>gamedata.dashboard</code>.
     */
    public final Dashboard DASHBOARD = Dashboard.DASHBOARD;

    /**
     * The table <code>gamedata.dashboard_element</code>.
     */
    public final DashboardElement DASHBOARD_ELEMENT = DashboardElement.DASHBOARD_ELEMENT;

    /**
     * The table <code>gamedata.dashboard_layout</code>.
     */
    public final DashboardLayout DASHBOARD_LAYOUT = DashboardLayout.DASHBOARD_LAYOUT;

    /**
     * The table <code>gamedata.dashboard_role</code>.
     */
    public final DashboardRole DASHBOARD_ROLE = DashboardRole.DASHBOARD_ROLE;

    /**
     * The table <code>gamedata.dashboard_session</code>.
     */
    public final DashboardSession DASHBOARD_SESSION = DashboardSession.DASHBOARD_SESSION;

    /**
     * The table <code>gamedata.dashboard_template</code>.
     */
    public final DashboardTemplate DASHBOARD_TEMPLATE = DashboardTemplate.DASHBOARD_TEMPLATE;

    /**
     * The table <code>gamedata.dashboard_token</code>.
     */
    public final DashboardToken DASHBOARD_TOKEN = DashboardToken.DASHBOARD_TOKEN;

    /**
     * The table <code>gamedata.element_property</code>.
     */
    public final ElementProperty ELEMENT_PROPERTY = ElementProperty.ELEMENT_PROPERTY;

    /**
     * The table <code>gamedata.error</code>.
     */
    public final Error ERROR = Error.ERROR;

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
     * The table <code>gamedata.game_session_role</code>.
     */
    public final GameSessionRole GAME_SESSION_ROLE = GameSessionRole.GAME_SESSION_ROLE;

    /**
     * The table <code>gamedata.game_token</code>.
     */
    public final GameToken GAME_TOKEN = GameToken.GAME_TOKEN;

    /**
     * The table <code>gamedata.game_version</code>.
     */
    public final GameVersion GAME_VERSION = GameVersion.GAME_VERSION;

    /**
     * The table <code>gamedata.group</code>.
     */
    public final Group GROUP = Group.GROUP;

    /**
     * The table <code>gamedata.group_attempt</code>.
     */
    public final GroupAttempt GROUP_ATTEMPT = GroupAttempt.GROUP_ATTEMPT;

    /**
     * The table <code>gamedata.group_event</code>.
     */
    public final GroupEvent GROUP_EVENT = GroupEvent.GROUP_EVENT;

    /**
     * The table <code>gamedata.group_objective</code>.
     */
    public final GroupObjective GROUP_OBJECTIVE = GroupObjective.GROUP_OBJECTIVE;

    /**
     * The table <code>gamedata.group_role</code>.
     */
    public final GroupRole GROUP_ROLE = GroupRole.GROUP_ROLE;

    /**
     * The table <code>gamedata.group_score</code>.
     */
    public final GroupScore GROUP_SCORE = GroupScore.GROUP_SCORE;

    /**
     * The table <code>gamedata.learning_goal</code>.
     */
    public final LearningGoal LEARNING_GOAL = LearningGoal.LEARNING_GOAL;

    /**
     * The table <code>gamedata.mission_event</code>.
     */
    public final MissionEvent MISSION_EVENT = MissionEvent.MISSION_EVENT;

    /**
     * The table <code>gamedata.organization</code>.
     */
    public final Organization ORGANIZATION = Organization.ORGANIZATION;

    /**
     * The table <code>gamedata.organization_game</code>.
     */
    public final OrganizationGame ORGANIZATION_GAME = OrganizationGame.ORGANIZATION_GAME;

    /**
     * The table <code>gamedata.organization_game_role</code>.
     */
    public final OrganizationGameRole ORGANIZATION_GAME_ROLE = OrganizationGameRole.ORGANIZATION_GAME_ROLE;

    /**
     * The table <code>gamedata.organization_game_token</code>.
     */
    public final OrganizationGameToken ORGANIZATION_GAME_TOKEN = OrganizationGameToken.ORGANIZATION_GAME_TOKEN;

    /**
     * The table <code>gamedata.organization_role</code>.
     */
    public final OrganizationRole ORGANIZATION_ROLE = OrganizationRole.ORGANIZATION_ROLE;

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
     * The table <code>gamedata.player_objective</code>.
     */
    public final PlayerObjective PLAYER_OBJECTIVE = PlayerObjective.PLAYER_OBJECTIVE;

    /**
     * The table <code>gamedata.player_score</code>.
     */
    public final PlayerScore PLAYER_SCORE = PlayerScore.PLAYER_SCORE;

    /**
     * The table <code>gamedata.property_value</code>.
     */
    public final PropertyValue PROPERTY_VALUE = PropertyValue.PROPERTY_VALUE;

    /**
     * The table <code>gamedata.scale</code>.
     */
    public final Scale SCALE = Scale.SCALE;

    /**
     * The table <code>gamedata.template_element</code>.
     */
    public final TemplateElement TEMPLATE_ELEMENT = TemplateElement.TEMPLATE_ELEMENT;

    /**
     * The table <code>gamedata.user</code>.
     */
    public final User USER = User.USER;

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
            Dashboard.DASHBOARD,
            DashboardElement.DASHBOARD_ELEMENT,
            DashboardLayout.DASHBOARD_LAYOUT,
            DashboardRole.DASHBOARD_ROLE,
            DashboardSession.DASHBOARD_SESSION,
            DashboardTemplate.DASHBOARD_TEMPLATE,
            DashboardToken.DASHBOARD_TOKEN,
            ElementProperty.ELEMENT_PROPERTY,
            Error.ERROR,
            Game.GAME,
            GameMission.GAME_MISSION,
            GameRole.GAME_ROLE,
            GameSession.GAME_SESSION,
            GameSessionRole.GAME_SESSION_ROLE,
            GameToken.GAME_TOKEN,
            GameVersion.GAME_VERSION,
            Group.GROUP,
            GroupAttempt.GROUP_ATTEMPT,
            GroupEvent.GROUP_EVENT,
            GroupObjective.GROUP_OBJECTIVE,
            GroupRole.GROUP_ROLE,
            GroupScore.GROUP_SCORE,
            LearningGoal.LEARNING_GOAL,
            MissionEvent.MISSION_EVENT,
            Organization.ORGANIZATION,
            OrganizationGame.ORGANIZATION_GAME,
            OrganizationGameRole.ORGANIZATION_GAME_ROLE,
            OrganizationGameToken.ORGANIZATION_GAME_TOKEN,
            OrganizationRole.ORGANIZATION_ROLE,
            Player.PLAYER,
            PlayerAttempt.PLAYER_ATTEMPT,
            PlayerEvent.PLAYER_EVENT,
            PlayerObjective.PLAYER_OBJECTIVE,
            PlayerScore.PLAYER_SCORE,
            PropertyValue.PROPERTY_VALUE,
            Scale.SCALE,
            TemplateElement.TEMPLATE_ELEMENT,
            User.USER
        );
    }
}
