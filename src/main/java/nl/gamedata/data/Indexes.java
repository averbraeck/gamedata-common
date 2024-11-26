/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data;


import nl.gamedata.data.tables.AccessToken;
import nl.gamedata.data.tables.GameAccess;
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
import nl.gamedata.data.tables.OrganizationRole;
import nl.gamedata.data.tables.Player;
import nl.gamedata.data.tables.PlayerAttempt;
import nl.gamedata.data.tables.PlayerEvent;
import nl.gamedata.data.tables.PlayerObjective;
import nl.gamedata.data.tables.PlayerScore;
import nl.gamedata.data.tables.PrivateDashboard;
import nl.gamedata.data.tables.PublicDashboard;
import nl.gamedata.data.tables.Scale;
import nl.gamedata.data.tables.SessionRole;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in gamedata.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index PRIVATE_DASHBOARD_FK_DASHBOARD_SETTING_GAME_ACCESS1_IDX = Internal.createIndex(DSL.name("fk_dashboard_setting_game_access1_idx"), PrivateDashboard.PRIVATE_DASHBOARD, new OrderField[] { PrivateDashboard.PRIVATE_DASHBOARD.GAME_ACCESS_ID }, false);
    public static final Index PRIVATE_DASHBOARD_FK_DASHBOARD_SETTING_GAME_MISSION1_IDX = Internal.createIndex(DSL.name("fk_dashboard_setting_game_mission1_idx"), PrivateDashboard.PRIVATE_DASHBOARD, new OrderField[] { PrivateDashboard.PRIVATE_DASHBOARD.GAME_MISSION_ID }, false);
    public static final Index PUBLIC_DASHBOARD_FK_GAME_DASHBOARD_GAME_MISSION1_IDX = Internal.createIndex(DSL.name("fk_game_dashboard_game_mission1_idx"), PublicDashboard.PUBLIC_DASHBOARD, new OrderField[] { PublicDashboard.PUBLIC_DASHBOARD.GAME_MISSION_ID }, false);
    public static final Index GAME_MISSION_FK_GAME_MISSION_GAME_VERSION1_IDX = Internal.createIndex(DSL.name("fk_game_mission_game_version1_idx"), GameMission.GAME_MISSION, new OrderField[] { GameMission.GAME_MISSION.GAME_VERSION_ID }, false);
    public static final Index GAME_SESSION_FK_GAME_SESSION_GAME_ACCESS1_IDX = Internal.createIndex(DSL.name("fk_game_session_game_access1_idx"), GameSession.GAME_SESSION, new OrderField[] { GameSession.GAME_SESSION.GAME_ACCESS_ID }, false);
    public static final Index GAME_SESSION_FK_GAME_SESSION_GAME_VERSION1_IDX = Internal.createIndex(DSL.name("fk_game_session_game_version1_idx"), GameSession.GAME_SESSION, new OrderField[] { GameSession.GAME_SESSION.GAME_VERSION_ID }, false);
    public static final Index GAME_TOKEN_FK_GAME_TOKEN_GAME1_IDX = Internal.createIndex(DSL.name("fk_game_token_game1_idx"), GameToken.GAME_TOKEN, new OrderField[] { GameToken.GAME_TOKEN.GAME_ID }, false);
    public static final Index ACCESS_TOKEN_FK_GAME_TOKEN_GAME_ACCESS1_IDX = Internal.createIndex(DSL.name("fk_game_token_game_access1_idx"), AccessToken.ACCESS_TOKEN, new OrderField[] { AccessToken.ACCESS_TOKEN.GAME_ACCESS_ID }, false);
    public static final Index GAME_VERSION_FK_GAME_VERSION_GAME1_IDX = Internal.createIndex(DSL.name("fk_game_version_game1_idx"), GameVersion.GAME_VERSION, new OrderField[] { GameVersion.GAME_VERSION.GAME_ID }, false);
    public static final Index GROUP_ATTEMPT_FK_GROUP_ATTEMPT_GAME_MISSION1_IDX = Internal.createIndex(DSL.name("fk_group_attempt_game_mission1_idx"), GroupAttempt.GROUP_ATTEMPT, new OrderField[] { GroupAttempt.GROUP_ATTEMPT.GAME_MISSION_ID }, false);
    public static final Index GROUP_ATTEMPT_FK_GROUP_ATTEMPT_GROUP1_IDX = Internal.createIndex(DSL.name("fk_group_attempt_group1_idx"), GroupAttempt.GROUP_ATTEMPT, new OrderField[] { GroupAttempt.GROUP_ATTEMPT.GROUP_ID }, false);
    public static final Index GROUP_EVENT_FK_GROUP_EVENT_GROUP_ATTEMPT1_IDX = Internal.createIndex(DSL.name("fk_group_event_group_attempt1_idx"), GroupEvent.GROUP_EVENT, new OrderField[] { GroupEvent.GROUP_EVENT.GROUP_ATTEMPT_ID }, false);
    public static final Index GROUP_FK_GROUP_GAME_SESSION1_IDX = Internal.createIndex(DSL.name("fk_group_game_session1_idx"), Group.GROUP, new OrderField[] { Group.GROUP.GAME_SESSION_ID }, false);
    public static final Index GROUP_OBJECTIVE_FK_GROUP_OBJECTIVE_LEARNING_GOAL1_IDX = Internal.createIndex(DSL.name("fk_group_objective_learning_goal1_idx"), GroupObjective.GROUP_OBJECTIVE, new OrderField[] { GroupObjective.GROUP_OBJECTIVE.LEARNING_GOAL_ID }, false);
    public static final Index GROUP_OBJECTIVE_FK_GROUP_OBJECTIVE_SCALE1_IDX = Internal.createIndex(DSL.name("fk_group_objective_scale1_idx"), GroupObjective.GROUP_OBJECTIVE, new OrderField[] { GroupObjective.GROUP_OBJECTIVE.SCALE_ID }, false);
    public static final Index GROUP_ROLE_FK_GROUP_ROLE_GROUP1_IDX = Internal.createIndex(DSL.name("fk_group_role_group1_idx"), GroupRole.GROUP_ROLE, new OrderField[] { GroupRole.GROUP_ROLE.GROUP_ID }, false);
    public static final Index GROUP_SCORE_FK_GROUP_SCORE_GROUP_ATTEMPT1_IDX = Internal.createIndex(DSL.name("fk_group_score_group_attempt1_idx"), GroupScore.GROUP_SCORE, new OrderField[] { GroupScore.GROUP_SCORE.GROUP_ATTEMPT_ID }, false);
    public static final Index GROUP_SCORE_FK_GROUP_SCORE_GROUP_OBJECTIVE1_IDX = Internal.createIndex(DSL.name("fk_group_score_group_objective1_idx"), GroupScore.GROUP_SCORE, new OrderField[] { GroupScore.GROUP_SCORE.GROUP_OBJECTIVE_ID }, false);
    public static final Index GROUP_SCORE_FK_GROUP_SCORE_SCALE1_IDX = Internal.createIndex(DSL.name("fk_group_score_scale1_idx"), GroupScore.GROUP_SCORE, new OrderField[] { GroupScore.GROUP_SCORE.SCALE_ID }, false);
    public static final Index LEARNING_GOAL_FK_LEARNING_GOAL_GAME_MISSION1_IDX = Internal.createIndex(DSL.name("fk_learning_goal_game_mission1_idx"), LearningGoal.LEARNING_GOAL, new OrderField[] { LearningGoal.LEARNING_GOAL.GAME_MISSION_ID }, false);
    public static final Index MISSION_EVENT_FK_MISSION_EVENT_GAME_MISSION1_IDX = Internal.createIndex(DSL.name("fk_mission_event_game_mission1_idx"), MissionEvent.MISSION_EVENT, new OrderField[] { MissionEvent.MISSION_EVENT.GAME_MISSION_ID }, false);
    public static final Index MISSION_EVENT_FK_MISSION_EVENT_GAME_SESSION1_IDX = Internal.createIndex(DSL.name("fk_mission_event_game_session1_idx"), MissionEvent.MISSION_EVENT, new OrderField[] { MissionEvent.MISSION_EVENT.GAME_SESSION_ID }, false);
    public static final Index ORGANIZATION_ROLE_FK_ORGANIZATION_ROLE_ORGANIZATION1_IDX = Internal.createIndex(DSL.name("fk_organization_role_organization1_idx"), OrganizationRole.ORGANIZATION_ROLE, new OrderField[] { OrganizationRole.ORGANIZATION_ROLE.ORGANIZATION_ID }, false);
    public static final Index ORGANIZATION_ROLE_FK_ORGANIZATION_ROLE_USER1_IDX = Internal.createIndex(DSL.name("fk_organization_role_user1_idx"), OrganizationRole.ORGANIZATION_ROLE, new OrderField[] { OrganizationRole.ORGANIZATION_ROLE.USER_ID }, false);
    public static final Index PLAYER_ATTEMPT_FK_PLAYER_ATTEMPT_GAME_MISSION1_IDX = Internal.createIndex(DSL.name("fk_player_attempt_game_mission1_idx"), PlayerAttempt.PLAYER_ATTEMPT, new OrderField[] { PlayerAttempt.PLAYER_ATTEMPT.GAME_MISSION_ID }, false);
    public static final Index PLAYER_ATTEMPT_FK_PLAYER_ATTEMPT_PLAYER1_IDX = Internal.createIndex(DSL.name("fk_player_attempt_player1_idx"), PlayerAttempt.PLAYER_ATTEMPT, new OrderField[] { PlayerAttempt.PLAYER_ATTEMPT.PLAYER_ID }, false);
    public static final Index PLAYER_FK_PLAYER_GAME_SESSION1_IDX = Internal.createIndex(DSL.name("fk_player_game_session1_idx"), Player.PLAYER, new OrderField[] { Player.PLAYER.GAME_SESSION_ID }, false);
    public static final Index PLAYER_FK_PLAYER_GROUP_ROLE1_IDX = Internal.createIndex(DSL.name("fk_player_group_role1_idx"), Player.PLAYER, new OrderField[] { Player.PLAYER.GROUP_ROLE_ID }, false);
    public static final Index PLAYER_EVENT_FK_PLAYER_LOGDATA_PLAYER_ATTEMPT1_IDX = Internal.createIndex(DSL.name("fk_player_logdata_player_attempt1_idx"), PlayerEvent.PLAYER_EVENT, new OrderField[] { PlayerEvent.PLAYER_EVENT.PLAYER_ATTEMPT_ID }, false);
    public static final Index PLAYER_OBJECTIVE_FK_PLAYER_OBJECTIVE_LEARNING_GOAL1_IDX = Internal.createIndex(DSL.name("fk_player_objective_learning_goal1_idx"), PlayerObjective.PLAYER_OBJECTIVE, new OrderField[] { PlayerObjective.PLAYER_OBJECTIVE.LEARNING_GOAL_ID }, false);
    public static final Index PLAYER_OBJECTIVE_FK_PLAYER_OBJECTIVE_SCALE1_IDX = Internal.createIndex(DSL.name("fk_player_objective_scale1_idx"), PlayerObjective.PLAYER_OBJECTIVE, new OrderField[] { PlayerObjective.PLAYER_OBJECTIVE.SCALE_ID }, false);
    public static final Index PLAYER_SCORE_FK_PLAYER_SCORE_PLAYER_ATTEMPT1_IDX = Internal.createIndex(DSL.name("fk_player_score_player_attempt1_idx"), PlayerScore.PLAYER_SCORE, new OrderField[] { PlayerScore.PLAYER_SCORE.PLAYER_ATTEMPT_ID }, false);
    public static final Index PLAYER_SCORE_FK_PLAYER_SCORE_PLAYER_OBJECTIVE1_IDX = Internal.createIndex(DSL.name("fk_player_score_player_objective1_idx"), PlayerScore.PLAYER_SCORE, new OrderField[] { PlayerScore.PLAYER_SCORE.PLAYER_OBJECTIVE_ID }, false);
    public static final Index PLAYER_SCORE_FK_PLAYER_SCORE_SCALE1_IDX = Internal.createIndex(DSL.name("fk_player_score_scale1_idx"), PlayerScore.PLAYER_SCORE, new OrderField[] { PlayerScore.PLAYER_SCORE.SCALE_ID }, false);
    public static final Index SCALE_FK_SCALE_GAME1_IDX = Internal.createIndex(DSL.name("fk_scale_game1_idx"), Scale.SCALE, new OrderField[] { Scale.SCALE.GAME_ID }, false);
    public static final Index SESSION_ROLE_FK_SESSION_ROLE_GAME_SESSION1_IDX = Internal.createIndex(DSL.name("fk_session_role_game_session1_idx"), SessionRole.SESSION_ROLE, new OrderField[] { SessionRole.SESSION_ROLE.GAME_SESSION_ID }, false);
    public static final Index SESSION_ROLE_FK_SESSION_ROLE_ORGANIZATION_ROLE1_IDX = Internal.createIndex(DSL.name("fk_session_role_organization_role1_idx"), SessionRole.SESSION_ROLE, new OrderField[] { SessionRole.SESSION_ROLE.ORGANIZATION_ROLE_ID }, false);
    public static final Index GAME_ACCESS_FK_TOKEN_GAME1_IDX = Internal.createIndex(DSL.name("fk_token_game1_idx"), GameAccess.GAME_ACCESS, new OrderField[] { GameAccess.GAME_ACCESS.GAME_ID }, false);
    public static final Index GAME_ACCESS_FK_TOKEN_ORGANIZATION1_IDX = Internal.createIndex(DSL.name("fk_token_organization1_idx"), GameAccess.GAME_ACCESS, new OrderField[] { GameAccess.GAME_ACCESS.ORGANIZATION_ID }, false);
    public static final Index GAME_ROLE_FK_USERROLE_GAME1_IDX = Internal.createIndex(DSL.name("fk_userrole_game1_idx"), GameRole.GAME_ROLE, new OrderField[] { GameRole.GAME_ROLE.GAME_ID }, false);
    public static final Index GAME_ROLE_FK_USERROLE_USER_IDX = Internal.createIndex(DSL.name("fk_userrole_user_idx"), GameRole.GAME_ROLE, new OrderField[] { GameRole.GAME_ROLE.USER_ID }, false);
}
