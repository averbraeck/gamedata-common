/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data;


import nl.gamedata.data.tables.AccessToken;
import nl.gamedata.data.tables.Game;
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
import nl.gamedata.data.tables.Organization;
import nl.gamedata.data.tables.Player;
import nl.gamedata.data.tables.PlayerAttempt;
import nl.gamedata.data.tables.PlayerEvent;
import nl.gamedata.data.tables.PlayerObjective;
import nl.gamedata.data.tables.PlayerScore;
import nl.gamedata.data.tables.PrivateDashboard;
import nl.gamedata.data.tables.PublicDashboard;
import nl.gamedata.data.tables.Scale;
import nl.gamedata.data.tables.User;
import nl.gamedata.data.tables.UserRole;
import nl.gamedata.data.tables.records.AccessTokenRecord;
import nl.gamedata.data.tables.records.GameAccessRecord;
import nl.gamedata.data.tables.records.GameMissionRecord;
import nl.gamedata.data.tables.records.GameRecord;
import nl.gamedata.data.tables.records.GameRoleRecord;
import nl.gamedata.data.tables.records.GameSessionRecord;
import nl.gamedata.data.tables.records.GameTokenRecord;
import nl.gamedata.data.tables.records.GameVersionRecord;
import nl.gamedata.data.tables.records.GroupAttemptRecord;
import nl.gamedata.data.tables.records.GroupEventRecord;
import nl.gamedata.data.tables.records.GroupObjectiveRecord;
import nl.gamedata.data.tables.records.GroupRecord;
import nl.gamedata.data.tables.records.GroupRoleRecord;
import nl.gamedata.data.tables.records.GroupScoreRecord;
import nl.gamedata.data.tables.records.LearningGoalRecord;
import nl.gamedata.data.tables.records.MissionEventRecord;
import nl.gamedata.data.tables.records.OrganizationRecord;
import nl.gamedata.data.tables.records.PlayerAttemptRecord;
import nl.gamedata.data.tables.records.PlayerEventRecord;
import nl.gamedata.data.tables.records.PlayerObjectiveRecord;
import nl.gamedata.data.tables.records.PlayerRecord;
import nl.gamedata.data.tables.records.PlayerScoreRecord;
import nl.gamedata.data.tables.records.PrivateDashboardRecord;
import nl.gamedata.data.tables.records.PublicDashboardRecord;
import nl.gamedata.data.tables.records.ScaleRecord;
import nl.gamedata.data.tables.records.UserRecord;
import nl.gamedata.data.tables.records.UserRoleRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * gamedata.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AccessTokenRecord> KEY_ACCESS_TOKEN_ID_UNIQUE = Internal.createUniqueKey(AccessToken.ACCESS_TOKEN, DSL.name("KEY_access_token_id_UNIQUE"), new TableField[] { AccessToken.ACCESS_TOKEN.ID }, true);
    public static final UniqueKey<AccessTokenRecord> KEY_ACCESS_TOKEN_PRIMARY = Internal.createUniqueKey(AccessToken.ACCESS_TOKEN, DSL.name("KEY_access_token_PRIMARY"), new TableField[] { AccessToken.ACCESS_TOKEN.ID }, true);
    public static final UniqueKey<AccessTokenRecord> KEY_ACCESS_TOKEN_VALUE_UNIQUE = Internal.createUniqueKey(AccessToken.ACCESS_TOKEN, DSL.name("KEY_access_token_value_UNIQUE"), new TableField[] { AccessToken.ACCESS_TOKEN.VALUE }, true);
    public static final UniqueKey<GameRecord> KEY_GAME_CODE_UNIQUE = Internal.createUniqueKey(Game.GAME, DSL.name("KEY_game_code_UNIQUE"), new TableField[] { Game.GAME.CODE }, true);
    public static final UniqueKey<GameRecord> KEY_GAME_ID_UNIQUE = Internal.createUniqueKey(Game.GAME, DSL.name("KEY_game_id_UNIQUE"), new TableField[] { Game.GAME.ID }, true);
    public static final UniqueKey<GameRecord> KEY_GAME_PRIMARY = Internal.createUniqueKey(Game.GAME, DSL.name("KEY_game_PRIMARY"), new TableField[] { Game.GAME.ID }, true);
    public static final UniqueKey<GameAccessRecord> KEY_GAME_ACCESS_ID_UNIQUE = Internal.createUniqueKey(GameAccess.GAME_ACCESS, DSL.name("KEY_game_access_id_UNIQUE"), new TableField[] { GameAccess.GAME_ACCESS.ID }, true);
    public static final UniqueKey<GameAccessRecord> KEY_GAME_ACCESS_PRIMARY = Internal.createUniqueKey(GameAccess.GAME_ACCESS, DSL.name("KEY_game_access_PRIMARY"), new TableField[] { GameAccess.GAME_ACCESS.ID }, true);
    public static final UniqueKey<GameMissionRecord> KEY_GAME_MISSION_ID_UNIQUE = Internal.createUniqueKey(GameMission.GAME_MISSION, DSL.name("KEY_game_mission_id_UNIQUE"), new TableField[] { GameMission.GAME_MISSION.ID }, true);
    public static final UniqueKey<GameMissionRecord> KEY_GAME_MISSION_PRIMARY = Internal.createUniqueKey(GameMission.GAME_MISSION, DSL.name("KEY_game_mission_PRIMARY"), new TableField[] { GameMission.GAME_MISSION.ID }, true);
    public static final UniqueKey<GameRoleRecord> KEY_GAME_ROLE_ID_UNIQUE = Internal.createUniqueKey(GameRole.GAME_ROLE, DSL.name("KEY_game_role_id_UNIQUE"), new TableField[] { GameRole.GAME_ROLE.ID }, true);
    public static final UniqueKey<GameRoleRecord> KEY_GAME_ROLE_PRIMARY = Internal.createUniqueKey(GameRole.GAME_ROLE, DSL.name("KEY_game_role_PRIMARY"), new TableField[] { GameRole.GAME_ROLE.ID }, true);
    public static final UniqueKey<GameSessionRecord> KEY_GAME_SESSION_ID_UNIQUE = Internal.createUniqueKey(GameSession.GAME_SESSION, DSL.name("KEY_game_session_id_UNIQUE"), new TableField[] { GameSession.GAME_SESSION.ID }, true);
    public static final UniqueKey<GameSessionRecord> KEY_GAME_SESSION_PRIMARY = Internal.createUniqueKey(GameSession.GAME_SESSION, DSL.name("KEY_game_session_PRIMARY"), new TableField[] { GameSession.GAME_SESSION.ID }, true);
    public static final UniqueKey<GameSessionRecord> KEY_GAME_SESSION_SESSION_TOKEN_UNIQUE = Internal.createUniqueKey(GameSession.GAME_SESSION, DSL.name("KEY_game_session_session_token_UNIQUE"), new TableField[] { GameSession.GAME_SESSION.SESSION_TOKEN }, true);
    public static final UniqueKey<GameTokenRecord> KEY_GAME_TOKEN_ID_UNIQUE = Internal.createUniqueKey(GameToken.GAME_TOKEN, DSL.name("KEY_game_token_id_UNIQUE"), new TableField[] { GameToken.GAME_TOKEN.ID }, true);
    public static final UniqueKey<GameTokenRecord> KEY_GAME_TOKEN_PRIMARY = Internal.createUniqueKey(GameToken.GAME_TOKEN, DSL.name("KEY_game_token_PRIMARY"), new TableField[] { GameToken.GAME_TOKEN.ID }, true);
    public static final UniqueKey<GameVersionRecord> KEY_GAME_VERSION_ID_UNIQUE = Internal.createUniqueKey(GameVersion.GAME_VERSION, DSL.name("KEY_game_version_id_UNIQUE"), new TableField[] { GameVersion.GAME_VERSION.ID }, true);
    public static final UniqueKey<GameVersionRecord> KEY_GAME_VERSION_PRIMARY = Internal.createUniqueKey(GameVersion.GAME_VERSION, DSL.name("KEY_game_version_PRIMARY"), new TableField[] { GameVersion.GAME_VERSION.ID }, true);
    public static final UniqueKey<GroupRecord> KEY_GROUP_ID_UNIQUE = Internal.createUniqueKey(Group.GROUP, DSL.name("KEY_group_id_UNIQUE"), new TableField[] { Group.GROUP.ID }, true);
    public static final UniqueKey<GroupRecord> KEY_GROUP_PRIMARY = Internal.createUniqueKey(Group.GROUP, DSL.name("KEY_group_PRIMARY"), new TableField[] { Group.GROUP.ID }, true);
    public static final UniqueKey<GroupAttemptRecord> KEY_GROUP_ATTEMPT_ID_UNIQUE = Internal.createUniqueKey(GroupAttempt.GROUP_ATTEMPT, DSL.name("KEY_group_attempt_id_UNIQUE"), new TableField[] { GroupAttempt.GROUP_ATTEMPT.ID }, true);
    public static final UniqueKey<GroupAttemptRecord> KEY_GROUP_ATTEMPT_PRIMARY = Internal.createUniqueKey(GroupAttempt.GROUP_ATTEMPT, DSL.name("KEY_group_attempt_PRIMARY"), new TableField[] { GroupAttempt.GROUP_ATTEMPT.ID }, true);
    public static final UniqueKey<GroupEventRecord> KEY_GROUP_EVENT_ID_UNIQUE = Internal.createUniqueKey(GroupEvent.GROUP_EVENT, DSL.name("KEY_group_event_id_UNIQUE"), new TableField[] { GroupEvent.GROUP_EVENT.ID }, true);
    public static final UniqueKey<GroupEventRecord> KEY_GROUP_EVENT_PRIMARY = Internal.createUniqueKey(GroupEvent.GROUP_EVENT, DSL.name("KEY_group_event_PRIMARY"), new TableField[] { GroupEvent.GROUP_EVENT.ID }, true);
    public static final UniqueKey<GroupObjectiveRecord> KEY_GROUP_OBJECTIVE_ID_UNIQUE = Internal.createUniqueKey(GroupObjective.GROUP_OBJECTIVE, DSL.name("KEY_group_objective_id_UNIQUE"), new TableField[] { GroupObjective.GROUP_OBJECTIVE.ID }, true);
    public static final UniqueKey<GroupObjectiveRecord> KEY_GROUP_OBJECTIVE_PRIMARY = Internal.createUniqueKey(GroupObjective.GROUP_OBJECTIVE, DSL.name("KEY_group_objective_PRIMARY"), new TableField[] { GroupObjective.GROUP_OBJECTIVE.ID }, true);
    public static final UniqueKey<GroupRoleRecord> KEY_GROUP_ROLE_ID_UNIQUE = Internal.createUniqueKey(GroupRole.GROUP_ROLE, DSL.name("KEY_group_role_id_UNIQUE"), new TableField[] { GroupRole.GROUP_ROLE.ID }, true);
    public static final UniqueKey<GroupRoleRecord> KEY_GROUP_ROLE_PRIMARY = Internal.createUniqueKey(GroupRole.GROUP_ROLE, DSL.name("KEY_group_role_PRIMARY"), new TableField[] { GroupRole.GROUP_ROLE.ID }, true);
    public static final UniqueKey<GroupScoreRecord> KEY_GROUP_SCORE_ID_UNIQUE = Internal.createUniqueKey(GroupScore.GROUP_SCORE, DSL.name("KEY_group_score_id_UNIQUE"), new TableField[] { GroupScore.GROUP_SCORE.ID }, true);
    public static final UniqueKey<GroupScoreRecord> KEY_GROUP_SCORE_PRIMARY = Internal.createUniqueKey(GroupScore.GROUP_SCORE, DSL.name("KEY_group_score_PRIMARY"), new TableField[] { GroupScore.GROUP_SCORE.ID }, true);
    public static final UniqueKey<LearningGoalRecord> KEY_LEARNING_GOAL_ID_UNIQUE = Internal.createUniqueKey(LearningGoal.LEARNING_GOAL, DSL.name("KEY_learning_goal_id_UNIQUE"), new TableField[] { LearningGoal.LEARNING_GOAL.ID }, true);
    public static final UniqueKey<LearningGoalRecord> KEY_LEARNING_GOAL_PRIMARY = Internal.createUniqueKey(LearningGoal.LEARNING_GOAL, DSL.name("KEY_learning_goal_PRIMARY"), new TableField[] { LearningGoal.LEARNING_GOAL.ID }, true);
    public static final UniqueKey<MissionEventRecord> KEY_MISSION_EVENT_ID_UNIQUE = Internal.createUniqueKey(MissionEvent.MISSION_EVENT, DSL.name("KEY_mission_event_id_UNIQUE"), new TableField[] { MissionEvent.MISSION_EVENT.ID }, true);
    public static final UniqueKey<MissionEventRecord> KEY_MISSION_EVENT_PRIMARY = Internal.createUniqueKey(MissionEvent.MISSION_EVENT, DSL.name("KEY_mission_event_PRIMARY"), new TableField[] { MissionEvent.MISSION_EVENT.ID }, true);
    public static final UniqueKey<OrganizationRecord> KEY_ORGANIZATION_CODE_UNIQUE = Internal.createUniqueKey(Organization.ORGANIZATION, DSL.name("KEY_organization_code_UNIQUE"), new TableField[] { Organization.ORGANIZATION.CODE }, true);
    public static final UniqueKey<OrganizationRecord> KEY_ORGANIZATION_ID_UNIQUE = Internal.createUniqueKey(Organization.ORGANIZATION, DSL.name("KEY_organization_id_UNIQUE"), new TableField[] { Organization.ORGANIZATION.ID }, true);
    public static final UniqueKey<OrganizationRecord> KEY_ORGANIZATION_PRIMARY = Internal.createUniqueKey(Organization.ORGANIZATION, DSL.name("KEY_organization_PRIMARY"), new TableField[] { Organization.ORGANIZATION.ID }, true);
    public static final UniqueKey<PlayerRecord> KEY_PLAYER_ID_UNIQUE = Internal.createUniqueKey(Player.PLAYER, DSL.name("KEY_player_id_UNIQUE"), new TableField[] { Player.PLAYER.ID }, true);
    public static final UniqueKey<PlayerRecord> KEY_PLAYER_PRIMARY = Internal.createUniqueKey(Player.PLAYER, DSL.name("KEY_player_PRIMARY"), new TableField[] { Player.PLAYER.ID }, true);
    public static final UniqueKey<PlayerAttemptRecord> KEY_PLAYER_ATTEMPT_ID_UNIQUE = Internal.createUniqueKey(PlayerAttempt.PLAYER_ATTEMPT, DSL.name("KEY_player_attempt_id_UNIQUE"), new TableField[] { PlayerAttempt.PLAYER_ATTEMPT.ID }, true);
    public static final UniqueKey<PlayerAttemptRecord> KEY_PLAYER_ATTEMPT_PRIMARY = Internal.createUniqueKey(PlayerAttempt.PLAYER_ATTEMPT, DSL.name("KEY_player_attempt_PRIMARY"), new TableField[] { PlayerAttempt.PLAYER_ATTEMPT.ID }, true);
    public static final UniqueKey<PlayerEventRecord> KEY_PLAYER_EVENT_ID_UNIQUE = Internal.createUniqueKey(PlayerEvent.PLAYER_EVENT, DSL.name("KEY_player_event_id_UNIQUE"), new TableField[] { PlayerEvent.PLAYER_EVENT.ID }, true);
    public static final UniqueKey<PlayerEventRecord> KEY_PLAYER_EVENT_PRIMARY = Internal.createUniqueKey(PlayerEvent.PLAYER_EVENT, DSL.name("KEY_player_event_PRIMARY"), new TableField[] { PlayerEvent.PLAYER_EVENT.ID }, true);
    public static final UniqueKey<PlayerObjectiveRecord> KEY_PLAYER_OBJECTIVE_ID_UNIQUE = Internal.createUniqueKey(PlayerObjective.PLAYER_OBJECTIVE, DSL.name("KEY_player_objective_id_UNIQUE"), new TableField[] { PlayerObjective.PLAYER_OBJECTIVE.ID }, true);
    public static final UniqueKey<PlayerObjectiveRecord> KEY_PLAYER_OBJECTIVE_PRIMARY = Internal.createUniqueKey(PlayerObjective.PLAYER_OBJECTIVE, DSL.name("KEY_player_objective_PRIMARY"), new TableField[] { PlayerObjective.PLAYER_OBJECTIVE.ID }, true);
    public static final UniqueKey<PlayerScoreRecord> KEY_PLAYER_SCORE_ID_UNIQUE = Internal.createUniqueKey(PlayerScore.PLAYER_SCORE, DSL.name("KEY_player_score_id_UNIQUE"), new TableField[] { PlayerScore.PLAYER_SCORE.ID }, true);
    public static final UniqueKey<PlayerScoreRecord> KEY_PLAYER_SCORE_PRIMARY = Internal.createUniqueKey(PlayerScore.PLAYER_SCORE, DSL.name("KEY_player_score_PRIMARY"), new TableField[] { PlayerScore.PLAYER_SCORE.ID }, true);
    public static final UniqueKey<PrivateDashboardRecord> KEY_PRIVATE_DASHBOARD_ID_UNIQUE = Internal.createUniqueKey(PrivateDashboard.PRIVATE_DASHBOARD, DSL.name("KEY_private_dashboard_id_UNIQUE"), new TableField[] { PrivateDashboard.PRIVATE_DASHBOARD.ID }, true);
    public static final UniqueKey<PrivateDashboardRecord> KEY_PRIVATE_DASHBOARD_PRIMARY = Internal.createUniqueKey(PrivateDashboard.PRIVATE_DASHBOARD, DSL.name("KEY_private_dashboard_PRIMARY"), new TableField[] { PrivateDashboard.PRIVATE_DASHBOARD.ID }, true);
    public static final UniqueKey<PublicDashboardRecord> KEY_PUBLIC_DASHBOARD_ID_UNIQUE = Internal.createUniqueKey(PublicDashboard.PUBLIC_DASHBOARD, DSL.name("KEY_public_dashboard_id_UNIQUE"), new TableField[] { PublicDashboard.PUBLIC_DASHBOARD.ID }, true);
    public static final UniqueKey<PublicDashboardRecord> KEY_PUBLIC_DASHBOARD_PRIMARY = Internal.createUniqueKey(PublicDashboard.PUBLIC_DASHBOARD, DSL.name("KEY_public_dashboard_PRIMARY"), new TableField[] { PublicDashboard.PUBLIC_DASHBOARD.ID }, true);
    public static final UniqueKey<ScaleRecord> KEY_SCALE_ID_UNIQUE = Internal.createUniqueKey(Scale.SCALE, DSL.name("KEY_scale_id_UNIQUE"), new TableField[] { Scale.SCALE.ID }, true);
    public static final UniqueKey<ScaleRecord> KEY_SCALE_PRIMARY = Internal.createUniqueKey(Scale.SCALE, DSL.name("KEY_scale_PRIMARY"), new TableField[] { Scale.SCALE.ID }, true);
    public static final UniqueKey<ScaleRecord> KEY_SCALE_TYPE_UNIQUE = Internal.createUniqueKey(Scale.SCALE, DSL.name("KEY_scale_type_UNIQUE"), new TableField[] { Scale.SCALE.TYPE }, true);
    public static final UniqueKey<UserRecord> KEY_USER_ID_UNIQUE = Internal.createUniqueKey(User.USER, DSL.name("KEY_user_id_UNIQUE"), new TableField[] { User.USER.ID }, true);
    public static final UniqueKey<UserRecord> KEY_USER_NAME_UNIQUE = Internal.createUniqueKey(User.USER, DSL.name("KEY_user_name_UNIQUE"), new TableField[] { User.USER.NAME }, true);
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(User.USER, DSL.name("KEY_user_PRIMARY"), new TableField[] { User.USER.ID }, true);
    public static final UniqueKey<UserRoleRecord> KEY_USER_ROLE_ID_UNIQUE = Internal.createUniqueKey(UserRole.USER_ROLE, DSL.name("KEY_user_role_id_UNIQUE"), new TableField[] { UserRole.USER_ROLE.ID }, true);
    public static final UniqueKey<UserRoleRecord> KEY_USER_ROLE_PRIMARY = Internal.createUniqueKey(UserRole.USER_ROLE, DSL.name("KEY_user_role_PRIMARY"), new TableField[] { UserRole.USER_ROLE.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AccessTokenRecord, GameAccessRecord> FK_ACCESS_TOKEN_GAME_ACCESS1 = Internal.createForeignKey(AccessToken.ACCESS_TOKEN, DSL.name("fk_access_token_game_access1"), new TableField[] { AccessToken.ACCESS_TOKEN.GAME_ACCESS_ID }, Keys.KEY_GAME_ACCESS_PRIMARY, new TableField[] { GameAccess.GAME_ACCESS.ID }, true);
    public static final ForeignKey<GameAccessRecord, GameRecord> FK_GAME_ACCESS_GAME1 = Internal.createForeignKey(GameAccess.GAME_ACCESS, DSL.name("fk_game_access_game1"), new TableField[] { GameAccess.GAME_ACCESS.GAME_ID }, Keys.KEY_GAME_PRIMARY, new TableField[] { Game.GAME.ID }, true);
    public static final ForeignKey<GameAccessRecord, OrganizationRecord> FK_GAME_ACCESS_ORGANIZATION1 = Internal.createForeignKey(GameAccess.GAME_ACCESS, DSL.name("fk_game_access_organization1"), new TableField[] { GameAccess.GAME_ACCESS.ORGANIZATION_ID }, Keys.KEY_ORGANIZATION_PRIMARY, new TableField[] { Organization.ORGANIZATION.ID }, true);
    public static final ForeignKey<GameMissionRecord, GameVersionRecord> FK_GAME_MISSION_GAME_VERSION1 = Internal.createForeignKey(GameMission.GAME_MISSION, DSL.name("fk_game_mission_game_version1"), new TableField[] { GameMission.GAME_MISSION.GAME_VERSION_ID }, Keys.KEY_GAME_VERSION_PRIMARY, new TableField[] { GameVersion.GAME_VERSION.ID }, true);
    public static final ForeignKey<GameRoleRecord, GameRecord> FK_GAME_ROLE_GAME1 = Internal.createForeignKey(GameRole.GAME_ROLE, DSL.name("fk_game_role_game1"), new TableField[] { GameRole.GAME_ROLE.GAME_ID }, Keys.KEY_GAME_PRIMARY, new TableField[] { Game.GAME.ID }, true);
    public static final ForeignKey<GameRoleRecord, UserRecord> FK_GAME_ROLE_USER = Internal.createForeignKey(GameRole.GAME_ROLE, DSL.name("fk_game_role_user"), new TableField[] { GameRole.GAME_ROLE.USER_ID }, Keys.KEY_USER_PRIMARY, new TableField[] { User.USER.ID }, true);
    public static final ForeignKey<GameSessionRecord, GameAccessRecord> FK_GAME_SESSION_GAME_ACCESS1 = Internal.createForeignKey(GameSession.GAME_SESSION, DSL.name("fk_game_session_game_access1"), new TableField[] { GameSession.GAME_SESSION.GAME_ACCESS_ID }, Keys.KEY_GAME_ACCESS_PRIMARY, new TableField[] { GameAccess.GAME_ACCESS.ID }, true);
    public static final ForeignKey<GameSessionRecord, GameVersionRecord> FK_GAME_SESSION_GAME_VERSION1 = Internal.createForeignKey(GameSession.GAME_SESSION, DSL.name("fk_game_session_game_version1"), new TableField[] { GameSession.GAME_SESSION.GAME_VERSION_ID }, Keys.KEY_GAME_VERSION_PRIMARY, new TableField[] { GameVersion.GAME_VERSION.ID }, true);
    public static final ForeignKey<GameTokenRecord, GameRecord> FK_GAME_TOKEN_GAME1 = Internal.createForeignKey(GameToken.GAME_TOKEN, DSL.name("fk_game_token_game1"), new TableField[] { GameToken.GAME_TOKEN.GAME_ID }, Keys.KEY_GAME_PRIMARY, new TableField[] { Game.GAME.ID }, true);
    public static final ForeignKey<GameVersionRecord, GameRecord> FK_GAME_VERSION_GAME1 = Internal.createForeignKey(GameVersion.GAME_VERSION, DSL.name("fk_game_version_game1"), new TableField[] { GameVersion.GAME_VERSION.GAME_ID }, Keys.KEY_GAME_PRIMARY, new TableField[] { Game.GAME.ID }, true);
    public static final ForeignKey<GroupRecord, GameSessionRecord> FK_GROUP_GAME_SESSION1 = Internal.createForeignKey(Group.GROUP, DSL.name("fk_group_game_session1"), new TableField[] { Group.GROUP.GAME_SESSION_ID }, Keys.KEY_GAME_SESSION_PRIMARY, new TableField[] { GameSession.GAME_SESSION.ID }, true);
    public static final ForeignKey<GroupAttemptRecord, GameMissionRecord> FK_GROUP_ATTEMPT_GAME_MISSION1 = Internal.createForeignKey(GroupAttempt.GROUP_ATTEMPT, DSL.name("fk_group_attempt_game_mission1"), new TableField[] { GroupAttempt.GROUP_ATTEMPT.GAME_MISSION_ID }, Keys.KEY_GAME_MISSION_PRIMARY, new TableField[] { GameMission.GAME_MISSION.ID }, true);
    public static final ForeignKey<GroupAttemptRecord, GroupRecord> FK_GROUP_ATTEMPT_GROUP1 = Internal.createForeignKey(GroupAttempt.GROUP_ATTEMPT, DSL.name("fk_group_attempt_group1"), new TableField[] { GroupAttempt.GROUP_ATTEMPT.GROUP_ID }, Keys.KEY_GROUP_PRIMARY, new TableField[] { Group.GROUP.ID }, true);
    public static final ForeignKey<GroupEventRecord, GroupAttemptRecord> FK_GROUP_EVENT_GROUP_ATTEMPT1 = Internal.createForeignKey(GroupEvent.GROUP_EVENT, DSL.name("fk_group_event_group_attempt1"), new TableField[] { GroupEvent.GROUP_EVENT.GROUP_ATTEMPT_ID }, Keys.KEY_GROUP_ATTEMPT_PRIMARY, new TableField[] { GroupAttempt.GROUP_ATTEMPT.ID }, true);
    public static final ForeignKey<GroupObjectiveRecord, LearningGoalRecord> FK_GROUP_OBJECTIVE_LEARNING_GOAL1 = Internal.createForeignKey(GroupObjective.GROUP_OBJECTIVE, DSL.name("fk_group_objective_learning_goal1"), new TableField[] { GroupObjective.GROUP_OBJECTIVE.LEARNING_GOAL_ID }, Keys.KEY_LEARNING_GOAL_PRIMARY, new TableField[] { LearningGoal.LEARNING_GOAL.ID }, true);
    public static final ForeignKey<GroupObjectiveRecord, ScaleRecord> FK_GROUP_OBJECTIVE_SCALE1 = Internal.createForeignKey(GroupObjective.GROUP_OBJECTIVE, DSL.name("fk_group_objective_scale1"), new TableField[] { GroupObjective.GROUP_OBJECTIVE.SCALE_ID }, Keys.KEY_SCALE_PRIMARY, new TableField[] { Scale.SCALE.ID }, true);
    public static final ForeignKey<GroupRoleRecord, GroupRecord> FK_GROUP_ROLE_GROUP1 = Internal.createForeignKey(GroupRole.GROUP_ROLE, DSL.name("fk_group_role_group1"), new TableField[] { GroupRole.GROUP_ROLE.GROUP_ID }, Keys.KEY_GROUP_PRIMARY, new TableField[] { Group.GROUP.ID }, true);
    public static final ForeignKey<GroupScoreRecord, GroupAttemptRecord> FK_GROUP_SCORE_GROUP_ATTEMPT1 = Internal.createForeignKey(GroupScore.GROUP_SCORE, DSL.name("fk_group_score_group_attempt1"), new TableField[] { GroupScore.GROUP_SCORE.GROUP_ATTEMPT_ID }, Keys.KEY_GROUP_ATTEMPT_PRIMARY, new TableField[] { GroupAttempt.GROUP_ATTEMPT.ID }, true);
    public static final ForeignKey<GroupScoreRecord, GroupObjectiveRecord> FK_GROUP_SCORE_GROUP_OBJECTIVE1 = Internal.createForeignKey(GroupScore.GROUP_SCORE, DSL.name("fk_group_score_group_objective1"), new TableField[] { GroupScore.GROUP_SCORE.GROUP_OBJECTIVE_ID }, Keys.KEY_GROUP_OBJECTIVE_PRIMARY, new TableField[] { GroupObjective.GROUP_OBJECTIVE.ID }, true);
    public static final ForeignKey<GroupScoreRecord, ScaleRecord> FK_GROUP_SCORE_SCALE1 = Internal.createForeignKey(GroupScore.GROUP_SCORE, DSL.name("fk_group_score_scale1"), new TableField[] { GroupScore.GROUP_SCORE.SCALE_ID }, Keys.KEY_SCALE_PRIMARY, new TableField[] { Scale.SCALE.ID }, true);
    public static final ForeignKey<LearningGoalRecord, GameMissionRecord> FK_LEARNING_GOAL_GAME_MISSION1 = Internal.createForeignKey(LearningGoal.LEARNING_GOAL, DSL.name("fk_learning_goal_game_mission1"), new TableField[] { LearningGoal.LEARNING_GOAL.GAME_MISSION_ID }, Keys.KEY_GAME_MISSION_PRIMARY, new TableField[] { GameMission.GAME_MISSION.ID }, true);
    public static final ForeignKey<MissionEventRecord, GameMissionRecord> FK_MISSION_EVENT_GAME_MISSION1 = Internal.createForeignKey(MissionEvent.MISSION_EVENT, DSL.name("fk_mission_event_game_mission1"), new TableField[] { MissionEvent.MISSION_EVENT.GAME_MISSION_ID }, Keys.KEY_GAME_MISSION_PRIMARY, new TableField[] { GameMission.GAME_MISSION.ID }, true);
    public static final ForeignKey<MissionEventRecord, GameSessionRecord> FK_MISSION_EVENT_GAME_SESSION1 = Internal.createForeignKey(MissionEvent.MISSION_EVENT, DSL.name("fk_mission_event_game_session1"), new TableField[] { MissionEvent.MISSION_EVENT.GAME_SESSION_ID }, Keys.KEY_GAME_SESSION_PRIMARY, new TableField[] { GameSession.GAME_SESSION.ID }, true);
    public static final ForeignKey<PlayerRecord, GameSessionRecord> FK_PLAYER_GAME_SESSION1 = Internal.createForeignKey(Player.PLAYER, DSL.name("fk_player_game_session1"), new TableField[] { Player.PLAYER.GAME_SESSION_ID }, Keys.KEY_GAME_SESSION_PRIMARY, new TableField[] { GameSession.GAME_SESSION.ID }, true);
    public static final ForeignKey<PlayerRecord, GroupRoleRecord> FK_PLAYER_GROUP_ROLE1 = Internal.createForeignKey(Player.PLAYER, DSL.name("fk_player_group_role1"), new TableField[] { Player.PLAYER.GROUP_ROLE_ID }, Keys.KEY_GROUP_ROLE_PRIMARY, new TableField[] { GroupRole.GROUP_ROLE.ID }, true);
    public static final ForeignKey<PlayerAttemptRecord, GameMissionRecord> FK_PLAYER_ATTEMPT_GAME_MISSION1 = Internal.createForeignKey(PlayerAttempt.PLAYER_ATTEMPT, DSL.name("fk_player_attempt_game_mission1"), new TableField[] { PlayerAttempt.PLAYER_ATTEMPT.GAME_MISSION_ID }, Keys.KEY_GAME_MISSION_PRIMARY, new TableField[] { GameMission.GAME_MISSION.ID }, true);
    public static final ForeignKey<PlayerAttemptRecord, PlayerRecord> FK_PLAYER_ATTEMPT_PLAYER1 = Internal.createForeignKey(PlayerAttempt.PLAYER_ATTEMPT, DSL.name("fk_player_attempt_player1"), new TableField[] { PlayerAttempt.PLAYER_ATTEMPT.PLAYER_ID }, Keys.KEY_PLAYER_PRIMARY, new TableField[] { Player.PLAYER.ID }, true);
    public static final ForeignKey<PlayerEventRecord, PlayerAttemptRecord> FK_PLAYER_EVENT_PLAYER_ATTEMPT1 = Internal.createForeignKey(PlayerEvent.PLAYER_EVENT, DSL.name("fk_player_event_player_attempt1"), new TableField[] { PlayerEvent.PLAYER_EVENT.PLAYER_ATTEMPT_ID }, Keys.KEY_PLAYER_ATTEMPT_PRIMARY, new TableField[] { PlayerAttempt.PLAYER_ATTEMPT.ID }, true);
    public static final ForeignKey<PlayerObjectiveRecord, LearningGoalRecord> FK_PLAYER_OBJECTIVE_LEARNING_GOAL1 = Internal.createForeignKey(PlayerObjective.PLAYER_OBJECTIVE, DSL.name("fk_player_objective_learning_goal1"), new TableField[] { PlayerObjective.PLAYER_OBJECTIVE.LEARNING_GOAL_ID }, Keys.KEY_LEARNING_GOAL_PRIMARY, new TableField[] { LearningGoal.LEARNING_GOAL.ID }, true);
    public static final ForeignKey<PlayerObjectiveRecord, ScaleRecord> FK_PLAYER_OBJECTIVE_SCALE1 = Internal.createForeignKey(PlayerObjective.PLAYER_OBJECTIVE, DSL.name("fk_player_objective_scale1"), new TableField[] { PlayerObjective.PLAYER_OBJECTIVE.SCALE_ID }, Keys.KEY_SCALE_PRIMARY, new TableField[] { Scale.SCALE.ID }, true);
    public static final ForeignKey<PlayerScoreRecord, PlayerAttemptRecord> FK_PLAYER_SCORE_PLAYER_ATTEMPT1 = Internal.createForeignKey(PlayerScore.PLAYER_SCORE, DSL.name("fk_player_score_player_attempt1"), new TableField[] { PlayerScore.PLAYER_SCORE.PLAYER_ATTEMPT_ID }, Keys.KEY_PLAYER_ATTEMPT_PRIMARY, new TableField[] { PlayerAttempt.PLAYER_ATTEMPT.ID }, true);
    public static final ForeignKey<PlayerScoreRecord, PlayerObjectiveRecord> FK_PLAYER_SCORE_PLAYER_OBJECTIVE1 = Internal.createForeignKey(PlayerScore.PLAYER_SCORE, DSL.name("fk_player_score_player_objective1"), new TableField[] { PlayerScore.PLAYER_SCORE.PLAYER_OBJECTIVE_ID }, Keys.KEY_PLAYER_OBJECTIVE_PRIMARY, new TableField[] { PlayerObjective.PLAYER_OBJECTIVE.ID }, true);
    public static final ForeignKey<PlayerScoreRecord, ScaleRecord> FK_PLAYER_SCORE_SCALE1 = Internal.createForeignKey(PlayerScore.PLAYER_SCORE, DSL.name("fk_player_score_scale1"), new TableField[] { PlayerScore.PLAYER_SCORE.SCALE_ID }, Keys.KEY_SCALE_PRIMARY, new TableField[] { Scale.SCALE.ID }, true);
    public static final ForeignKey<PrivateDashboardRecord, GameAccessRecord> FK_PRIVATE_DASHBOARD_GAME_ACCESS1 = Internal.createForeignKey(PrivateDashboard.PRIVATE_DASHBOARD, DSL.name("fk_private_dashboard_game_access1"), new TableField[] { PrivateDashboard.PRIVATE_DASHBOARD.GAME_ACCESS_ID }, Keys.KEY_GAME_ACCESS_PRIMARY, new TableField[] { GameAccess.GAME_ACCESS.ID }, true);
    public static final ForeignKey<PrivateDashboardRecord, GameMissionRecord> FK_PRIVATE_DASHBOARD_GAME_MISSION1 = Internal.createForeignKey(PrivateDashboard.PRIVATE_DASHBOARD, DSL.name("fk_private_dashboard_game_mission1"), new TableField[] { PrivateDashboard.PRIVATE_DASHBOARD.GAME_MISSION_ID }, Keys.KEY_GAME_MISSION_PRIMARY, new TableField[] { GameMission.GAME_MISSION.ID }, true);
    public static final ForeignKey<PublicDashboardRecord, GameMissionRecord> FK_PUBLIC_DASHBOARD_GAME_MISSION1 = Internal.createForeignKey(PublicDashboard.PUBLIC_DASHBOARD, DSL.name("fk_public_dashboard_game_mission1"), new TableField[] { PublicDashboard.PUBLIC_DASHBOARD.GAME_MISSION_ID }, Keys.KEY_GAME_MISSION_PRIMARY, new TableField[] { GameMission.GAME_MISSION.ID }, true);
    public static final ForeignKey<ScaleRecord, GameRecord> FK_SCALE_GAME1 = Internal.createForeignKey(Scale.SCALE, DSL.name("fk_scale_game1"), new TableField[] { Scale.SCALE.GAME_ID }, Keys.KEY_GAME_PRIMARY, new TableField[] { Game.GAME.ID }, true);
    public static final ForeignKey<UserRoleRecord, GameAccessRecord> FK_USER_ROLE_GAME_ACCESS1 = Internal.createForeignKey(UserRole.USER_ROLE, DSL.name("fk_user_role_game_access1"), new TableField[] { UserRole.USER_ROLE.SESSION_GAME_ACCESS_ID }, Keys.KEY_GAME_ACCESS_PRIMARY, new TableField[] { GameAccess.GAME_ACCESS.ID }, true);
    public static final ForeignKey<UserRoleRecord, GameSessionRecord> FK_USER_ROLE_GAME_SESSION1 = Internal.createForeignKey(UserRole.USER_ROLE, DSL.name("fk_user_role_game_session1"), new TableField[] { UserRole.USER_ROLE.SESSION_GAME_SESSION_ID }, Keys.KEY_GAME_SESSION_PRIMARY, new TableField[] { GameSession.GAME_SESSION.ID }, true);
    public static final ForeignKey<UserRoleRecord, OrganizationRecord> FK_USER_ROLE_ORGANIZATION1 = Internal.createForeignKey(UserRole.USER_ROLE, DSL.name("fk_user_role_organization1"), new TableField[] { UserRole.USER_ROLE.ORGANIZATION_ID }, Keys.KEY_ORGANIZATION_PRIMARY, new TableField[] { Organization.ORGANIZATION.ID }, true);
    public static final ForeignKey<UserRoleRecord, UserRecord> FK_USER_ROLE_USER1 = Internal.createForeignKey(UserRole.USER_ROLE, DSL.name("fk_user_role_user1"), new TableField[] { UserRole.USER_ROLE.USER_ID }, Keys.KEY_USER_PRIMARY, new TableField[] { User.USER.ID }, true);
}
