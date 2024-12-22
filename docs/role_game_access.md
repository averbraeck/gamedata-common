# <a name="edit"></a>Game Access roles

## Game Access `edit` role

A `game_acccess` editor is given access to a **single game** for an organization. The user with a game_access edit role can define (create, edit, delete) dashboards and game sessions for that game combined with that organization only. They do not have access to other users, roles, games, or the organization itself. When an `game_access_role` with **edit** rights has been defined for a `user`, the user has the following access to the database tables:

| Table | Access | Explanation |
| ----- | ------ | ----------- |
| `access_token` | CREATE | Create, edit and delete `access_token` records for the `game_access` record for which the role has been defined. NONE access to records not linked to the game access record. |
| `dashboard` | CREATE | Game access editors can create, edit and delete dashboards for all templates they have access to through their combination of game and organization (including those with VIEW access). NONE access to records not linked to the combination of game and organization. |
| `dashboard_element` | VIEW | All game access editors can view all existing dashboard elements (these are defined with backend code changes). |
| `dashboard_layout` | VIEW | All game access editors can view all the existing dashboard layouts (these are defined with backend code changes). |
| `dashboard_role` | NONE | Game access editors cannot see dashboard roles. |
| `dashboard_session` | CREATE | Game access editors can create, edit and delete `dashboard_session` records between all dashboards and game records to which they have access |
| `dashboard_template` | CREATE | Create, edit and delete `dashboard_template` records that have a relation to the `game_access` record to which the user has access. The user can also create, edit and delete `template_element` and `property_value` records for `dashboard_template` records to which the user has CREATE access. The access is NONE for other templates. |
| `dashboard_token` | CREATE | Game access editors can create, edit and delete dashboard tokens for all dashboards they have access to. |
| `element_property` | VIEW | All game access editors can view all the existing element properties (these are defined with backend code changes). |
| `game` | VIEW | View `game` records for the `game_access` record to which this user has access. This also gives VIEW access to corresponding records in: `game_version`, `game_mission`, `learning_goal`, `player_objective`, `group_objective`, and `scale` |
| `game_access`  | NONE | The game access editor cannot access `game_access` records. |
| `game_access_role` | NONE | The game access editor cannot access `game_access_role` records. |
| `game_mission` | VIEW | View records for games accessible through the `game_access` record to which this user has access. |
| `game_role` | NONE | The game access editor cannot access `game_role` records. |
| `game_session` | CREATE | Create, edit and delete `game_session` records for the `game_access` record to which this user has access. |
| `game_token` | NONE | The game access editor cannot change or even view `game_token` records. |
| `game_version` | VIEW | View records for games accessible through the `game_access` record to which this user has access. |
| `group` | VIEW | View data for all `game_session` records belonging to the `game_access` record to which this user has access. |
| `group_attempt` | VIEW | View data for all `game_session` records belonging to the `game_access` record to which this user has access. |
| `group_event` | VIEW | View data for all `game_session` records belonging to the `game_access` record to which this user has access. |
| `group_objective` | VIEW | View records for games accessible through the `game_access` record to which this user has access. |
| `group_role` | VIEW | View data for all `game_session` records belonging to the `game_access` record to which this user has access. |
| `group_score` | VIEW | View data for all `game_session` records belonging to the `game_access` record to which this user has access. |
| `learning_goal` | VIEW | View records for games accessible through the `game_access` record to which this user has access. |
| `mission_event` | VIEW | View data for all `game_session` records belonging to the `game_access` record to which this user has access. |
| `organization` | NONE | Game access editors do not have access to the organization's information. |
| `organization_role` | NONE | Game access editors cannot view `organization_role` records. |
| `player` | VIEW | View data for all `game_session` records belonging to the `game_access` record to which this user has access. |
| `player_attempt` | VIEW | View data for all `game_session` records belonging to the `game_access` record to which this user has access. |
| `player_event` | VIEW | View data for all `game_session` records belonging to the `game_access` record to which this user has access. |
| `player_objective` | VIEW | View records for games accessible through the `game_access` record to which this user has access. |
| `player_score` | VIEW | View data for all `game_session` records belonging to the `game_access` record to which this user has access. |
| `property_value` | CREATE | Create, edit and delete `property_value` records for `dashboard_template` records to which the user has CREATE access. |
|   | VIEW | View `property_value` records for `dashboard_template` records to which the user has VIEW access. |
| `scale` | VIEW | View records for games accessible through the `game_access` record to which this user has access. |
| `session_role` | NONE | The game access editor does not have access to users or roles. |
| `template_element` | CREATE | Create, edit and delete `template_element` records for `dashboard_template` records to which the user has CREATE access. |
|   | VIEW | View `template_element` records for `dashboard_template` records to which the user has VIEW access. |
| `user` | NONE | Game access editors cannot access other users. |

## <a name="view"></a>Game Access `view` role

A game access viewer can access all games that the organization has access to, as well as dashboards and game sessions. No changes to any element can be made, though. Game access viewers do not have access to other users or any roles. When a `game_access_role` with **view** rights has been defined for a `user`, the user has the following access to the database tables:

| Table | Access | Explanation |
| ----- | ------ | ----------- |
| `access_token` | VIEW | View `access_token` records for the `game_access` record to which this user has access. |
| `dashboard` | VIEW | Game access viewers can view dashboards for all templates they have access to through their combination of game and organization (including those with VIEW access). NONE access to records not linked to the combination of game and organization. |
| `dashboard_element` | VIEW | All game access viewers can view all existing dashboard elements (these are defined with backend code changes). |
| `dashboard_layout` | VIEW | All game access viewers can view all the existing dashboard layouts (these are defined with backend code changes). |
| `dashboard_role` | NONE | Game access viewers cannot see dashboard roles. |
| `dashboard_session` | VIEW | Game access viewers can view `dashboard_session` records between all dashboards and game records to which they have access |
| `dashboard_template` | VIEW | View `dashboard_template` records that have a relation the `game_access` record to which the role provides access. The access is NONE for other templates. |
| `dashboard_token` | VIEW | Game access viewers can view dashboard tokens for all dashboards they have access to. |
| `element_property` | VIEW | All game access viewers can view all the existing element properties (these are defined with backend code changes). |
| `game` | VIEW | View `game` records for the `game_access` record to which this user has access. This also gives VIEW access to corresponding records in: `game_version`, `game_mission`, `learning_goal`, `player_objective`, `group_objective`, and `scale` |
| `game_access`  | NONE | The game access viewer cannot access `game_access` records. |
| `game_access_role` | NONE | The game access viewer cannot access `game_access_role` records. |
| `game_mission` | VIEW | View records for games accessible through the `game_access` record to which this user has access. |
| `game_role` | NONE | The game access viewer cannot access `game_role` records. |
| `game_session` | VIEW | View `game_session` records for the `game_access` record to which this user has access. |
| `game_token` | NONE | The game access viewer cannot change or even view `game_token` records. |
| `game_version` | VIEW | View records for games accessible through the `game_access` record to which this user has access. |
| `group` | VIEW | View data for all `game_session` records belonging to the `game_access` record to which this user has access. |
| `group_attempt` | VIEW | View data for all `game_session` records belonging to the `game_access` record to which this user has access. |
| `group_event` | VIEW | View data for all `game_session` records belonging to the `game_access` record to which this user has access. |
| `group_objective` | VIEW | View records for games accessible through the `game_access` record to which this user has access. |
| `group_role` | VIEW | View data for all `game_session` records belonging to the `game_access` record to which this user has access. |
| `group_score` | VIEW | View data for all `game_session` records belonging to the `game_access` record to which this user has access. |
| `learning_goal` | VIEW | View records for games accessible through the `game_access` record to which this user has access. |
| `mission_event` | VIEW | View data for all `game_session` records belonging to the `game_access` record to which this user has access. |
| `organization` | NONE | Game access viewers do not have access to the organization's information. |
| `organization_role` | NONE | Game access viewers cannot view `organization_role` records. |
| `player` | VIEW | View data for all `game_session` records belonging to the `game_access` record to which this user has access. |
| `player_attempt` | VIEW | View data for all `game_session` records belonging to the `game_access` record to which this user has access. |
| `player_event` | VIEW | View data for all `game_session` records belonging to the `game_access` record to which this user has access. |
| `player_objective` | VIEW | View records for games accessible through the `game_access` record to which this user has access. |
| `player_score` | VIEW | View data for all `game_session` records belonging to the `game_access` record to which this user has access. |
| `property_value` | VIEW | View `property_value` records for `dashboard_template` records to which the user has VIEW access. |
| `scale` | VIEW | View records for games accessible through the `game_access` record to which this user has access. |
| `session_role` | NONE | The game access viewer does not have access to users or roles. |
| `template_element` | VIEW | View `template_element` records for `dashboard_template` records to which the user has VIEW access. |
| `user` | NONE | Game access viewers cannot access or see other users. |

