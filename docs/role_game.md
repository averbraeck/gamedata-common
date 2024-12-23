# <a name="admin"></a>Game roles

## User `game_admin` role

When the `game_admin` role has been defined for a `user`, the user has the following access to the database tables:

| Table | Access | Explanation |
| ----- | ------ | ----------- |
| `dashboard` | CREATE | Game admins can create, edit and delete dashboards for their games. The access is NONE for dashboards not linked to a game the game admin can edit. |
| `dashboard_element` | VIEW | Game admins can view all existing dashboard elements (these are defined with backend code changes). |
| `dashboard_layout` | VIEW | Game admins can view all the existing dashboard layouts (these are defined with backend code changes). |
| `dashboard_role` | CREATE | Game admins can create, edit and delete dashboard roles for all templates they have CREATE access to. |
| `dashboard_session` | NONE | A game admin does not have access to `dashboard_session` records. |
| `dashboard_template` | NONE | A game admin does not have access to `dashboard_template` records that have a relation to existing `organization_game` records for an `organization`. |
|   | CREATE | A game admin can create, edit and view `dashboard_template` records that do not have a relation to existing `organization_game` records for an `organization`, but that do refer to games to which the `game_admin` has edit access. |
| `dashboard_token` | CREATE | Game admins can create, edit and delete dashboard tokens for all dashboards they have access to. |
| `element_property` | VIEW | All game admins can view all the existing element properties (these are defined with backend code changes). |
| `game` | CREATE | Game admins can create, edit and delete `game` records (edit and delete for games for which they have an edit role). When creating a game, the user automatically becomes an editor of the game. |
| `game_mission` | CREATE | A game admin can create, edit and delete `game_mission` records for games for which they have an edit role. |
| `game_role` | CREATE | A game admin can create, edit and delete `game_role` records for games for which they have an edit role. |
| `game_session` | NONE | A game admin does not have access to `game_session` records. |
| `game_session_role` | NONE | A game admin does not have access to `game_session_role` records. |
| `game_token` | CREATE | A game admin can create, edit and delete `game_token` records for games for which they have an edit role. |
| `game_version` | CREATE | A game admin can create, edit and delete `game_version` records for games for which they have an edit role. |
| `group` | NONE | A game admin does not have access to `group` records. |
| `group_attempt` | NONE | A game admin does not have access to `group_attempt` records. |
| `group_event` | NONE | A game admin does not have access to `group_event` records. |
| `group_objective` | CREATE | A game admin can create, edit and delete `group_objective` records for games for which they have an edit role. |
| `group_role` | NONE | A game admin does not have access to `group_role` records. |
| `group_score` | NONE | A game admin does not have access to `group_score` records. |
| `learning_goal` | CREATE | A game admin can create, edit and delete `learning_goal` records for games for which they have an edit role. |
| `mission_event` | NONE | A game admin does not have access to `mission_event` records. |
| `organization` | NONE | A game admin does not have access to `organization` records. |
| `organization_game`  | NONE | A game admin does not have access to `organization_game` records. |
| `organization_game_role` | NONE | A game admin does not have access to `organization_game_role` records. |
| `organization_game_token` | NONE | A game admin does not have access to `organization_game_token` records. |
| `organization_role` | NONE | A game admin does not have access to `organization_role` records. |
| `player` | NONE | A game admin does not have access to `player` records. |
| `player_attempt` | NONE | A game admin does not have access to `player_attempt` records. |
| `player_event` | NONE | A game admin does not have access to `player_event` records. |
| `player_objective` | CREATE | A game admin can create, edit and delete `player_objective` records for games for which they have an edit role. |
| `player_score` | NONE | A game admin does not have access to `player_score` records. |
| `property_value` | CREATE | Create, edit and delete `property_value` records for `dashboard_template` records to which the user has CREATE access. |
| `scale` | CREATE | A game admin can create, edit and delete `scale` records for games for which they have an edit role. |
| `template_element` | CREATE | Create, edit and delete `template_element` records for `dashboard_template` records to which the user has CREATE access. |
| `user` | CREATE | Game admins can create **but not edit or delete** new users, and view all existing users in the database. |


## <a name="edit"></a>Game `edit` role

A game editor can edit the game that the `game_role` provides access to. Game editors do not have access to other users, organizations, roles, sessions or game data. When a `game_role` with **edit** rights has been defined for a `user`, the user has the following access to the database tables:

| Table | Access | Explanation |
| ----- | ------ | ----------- |
| `dashboard` | CREATE | Game editors can create, edit and delete dashboards for their games. The access is NONE for dashboards not linked to a game the game editor can edit. |
| `dashboard_element` | VIEW | Game editors can view all existing dashboard elements (these are defined with backend code changes). |
| `dashboard_layout` | VIEW | Game editors can view all the existing dashboard layouts (these are defined with backend code changes). |
| `dashboard_role` | CREATE | Game editors can create, edit and delete dashboard roles for all templates they have CREATE access to. |
| `dashboard_session` | NONE | A game editor does not have access to `dashboard_session` records. |
| `dashboard_template` | NONE | A game editor does not have access to `dashboard_template` records that have a relation to existing `organization_game` records for an `organization`. |
|   | CREATE | A game editor can create, edit and view `dashboard_template` records that do not have a relation to existing `organization_game` records for an `organization`, but that do refer to games to which the `game_editor` has edit access. |
| `dashboard_token` | CREATE | Game editors can create, edit and delete dashboard tokens for all dashboards they have access to. |
| `element_property` | VIEW | All game editors can view all the existing element properties (these are defined with backend code changes). |
| `game` | EDIT | Game editors can edit `game` records. |
| `game_mission` | CREATE | A game editor can create, edit and delete `game_mission` records for games for which they have an edit role. |
| `game_role` | NONE | A game editor does not have access to `game_role` records. |
| `game_session` | NONE | A game editor does not have access to `game_session` records. |
| `game_session_role` | NONE | A game editor does not have access to `game_session_role` records. |
| `game_token` | CREATE | A game editor can create, edit and delete `game_token` records for games for which they have an edit role. |
| `game_version` | CREATE | A game editor can create, edit and delete `game_version` records for games for which they have an edit role. |
| `group` | NONE | A game editor does not have access to `group` records. |
| `group_attempt` | NONE | A game editor does not have access to `group_attempt` records. |
| `group_event` | NONE | A game editor does not have access to `group_event` records. |
| `group_objective` | CREATE | A game editor can create, edit and delete `group_objective` records for games for which they have an edit role. |
| `group_role` | NONE | A game editor does not have access to `group_role` records. |
| `group_score` | NONE | A game editor does not have access to `group_score` records. |
| `learning_goal` | CREATE | A game editor can create, edit and delete `learning_goal` records for games for which they have an edit role. |
| `mission_event` | NONE | A game editor does not have access to `mission_event` records. |
| `organization` | NONE | A game editor does not have access to `organization` records. |
| `organization_game`  | NONE | A game editor does not have access to `organization_game` records. |
| `organization_game_role` | NONE | A game editor does not have access to `organization_game_role` records. |
| `organization_game_token` | NONE | A game editor does not have access to `organization_game_token` records. |
| `organization_role` | NONE | A game editor does not have access to `organization_role` records. |
| `player` | NONE | A game editor does not have access to `player` records. |
| `player_attempt` | NONE | A game editor does not have access to `player_attempt` records. |
| `player_event` | NONE | A game editor does not have access to `player_event` records. |
| `player_objective` | CREATE | A game editor can create, edit and delete `player_objective` records for games for which they have an edit role. |
| `player_score` | NONE | A game editor does not have access to `player_score` records. |
| `property_value` | CREATE | Create, edit and delete `property_value` records for `dashboard_template` records to which the user has CREATE access. |
| `scale` | CREATE | A game editor can create, edit and delete `scale` records for games for which they have an edit role. |
| `template_element` | CREATE | Create, edit and delete `template_element` records for `dashboard_template` records to which the user has CREATE access. |
| `user` | NONE | A game editor does not have access to `user` records. |


## <a name="view"></a>Game `view` role

A game viewer can access the game that the `game_role` provides access to. Game editors do not have access to other users, organizations, roles, sessions or game data, and cannot write any data to the database. When a `game_role` with **view** rights has been defined for a `user`, the user has the following access to the database tables:

| Table | Access | Explanation |
| ----- | ------ | ----------- |
| `dashboard` | VIEW | Game editors can view dashboards for their games. The access is NONE for dashboards not linked to a game the game editor can edit. |
| `dashboard_element` | VIEW | Game editors can view all existing dashboard elements (these are defined with backend code changes). |
| `dashboard_layout` | VIEW | Game editors can view all the existing dashboard layouts (these are defined with backend code changes). |
| `dashboard_role` | VIEW | Game editors can view dashboard roles for all templates they have VIEW access to. |
| `dashboard_session` | NONE | A game editor does not have access to `dashboard_session` records. |
| `dashboard_template` | NONE | A game editor does not have access to `dashboard_template` records that have a relation to existing `organization_game` records for an `organization`. |
|   | VIEW | A game editor can create, edit and view `dashboard_template` records that do not have a relation to existing `organization_game` records for an `organization`, but that do refer to games to which the `game_editor` has edit access. |
| `dashboard_token` | VIEW | Game editors can view dashboard tokens for all dashboards they have access to. |
| `element_property` | VIEW | All game editors can view all the existing element properties (these are defined with backend code changes). |
| `game` | EDIT | Game editors can edit `game` records. |
| `game_mission` | VIEW | A game editor can view `game_mission` records for games for which they have an edit role. |
| `game_role` | NONE | A game editor does not have access to `game_role` records. |
| `game_session` | NONE | A game editor does not have access to `game_session` records. |
| `game_session_role` | NONE | A game editor does not have access to `game_session_role` records. |
| `game_token` | VIEW | A game editor can view `game_token` records for games for which they have an edit role. |
| `game_version` | VIEW | A game editor can view `game_version` records for games for which they have an edit role. |
| `group` | NONE | A game editor does not have access to `group` records. |
| `group_attempt` | NONE | A game editor does not have access to `group_attempt` records. |
| `group_event` | NONE | A game editor does not have access to `group_event` records. |
| `group_objective` | VIEW | A game editor can view `group_objective` records for games for which they have an edit role. |
| `group_role` | NONE | A game editor does not have access to `group_role` records. |
| `group_score` | NONE | A game editor does not have access to `group_score` records. |
| `learning_goal` | VIEW | A game editor can view `learning_goal` records for games for which they have an edit role. |
| `mission_event` | NONE | A game editor does not have access to `mission_event` records. |
| `organization` | NONE | A game editor does not have access to `organization` records. |
| `organization_game`  | NONE | A game editor does not have access to `organization_game` records. |
| `organization_game_role` | NONE | A game editor does not have access to `organization_game_role` records. |
| `organization_game_token` | NONE | A game editor does not have access to `organization_game_token` records. |
| `organization_role` | NONE | A game editor does not have access to `organization_role` records. |
| `player` | NONE | A game editor does not have access to `player` records. |
| `player_attempt` | NONE | A game editor does not have access to `player_attempt` records. |
| `player_event` | NONE | A game editor does not have access to `player_event` records. |
| `player_objective` | VIEW | A game editor can view `player_objective` records for games for which they have an edit role. |
| `player_score` | NONE | A game editor does not have access to `player_score` records. |
| `property_value` | VIEW | Create, edit and delete `property_value` records for `dashboard_template` records to which the user has VIEW access. |
| `scale` | VIEW | A game editor can view `scale` records for games for which they have an edit role. |
| `template_element` | VIEW | Create, edit and delete `template_element` records for `dashboard_template` records to which the user has VIEW access. |
| `user` | NONE | A game editor does not have access to `user` records. |

