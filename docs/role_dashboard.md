# <a name="edit"></a>Dashboard roles

## Dashboard `edit` role

A `dashboard` editor is given access to a **single dashboard**. They do not have access to users, roles, games, organizations, sessions and data. When a `dashboard_role` with **edit** rights has been defined for a `user`, the user has the following access to the database tables:

| Table | Access | Explanation |
| ----- | ------ | ----------- |
| `access_token` | NONE | Dashboard editors cannot see access tokens. |
| `dashboard` | EDIT | Dashboard editors can edit, but not create or delete, dashboards linked to their `dashboard_template` access. |
| `dashboard_element` | VIEW | All dashboard editors can view all existing dashboard elements (these are defined with backend code changes). |
| `dashboard_layout` | VIEW | All dashboard editors can view all the existing dashboard layouts (these are defined with backend code changes). |
| `dashboard_role` | NONE | Dashboard editors cannot see dashboard roles. |
| `dashboard_session` | NONE | Dashboard editors cannot see dashboard sessions. |
| `dashboard_template` | EDIT | Edit, but not create or delete, the `dashboard_template` record to which the user has access. |
| `dashboard_token` | CREATE | Dashboard editors can create, edit and delete dashboard tokens for all dashboards they have access to. |
| `element_property` | VIEW | All game access editors can view all the existing element properties (these are defined with backend code changes). |
| `game` | VIEW | View `game` records for the `dashboard_template` record to which this user has access. This also gives VIEW access to corresponding records in: `game_version`, `game_mission`, `learning_goal`, `player_objective`, `group_objective`, and `scale` |
| `game_access`  | NONE | The dashboard editor cannot access `game_access` records. |
| `game_access_role` | NONE | The dashboard editor cannot access `game_access_role` records. |
| `game_mission` | VIEW | View records for games accessible through the `dashboard_template` record to which this user has access. |
| `game_role` | NONE | The dashboard editor cannot access `game_role` records. |
| `game_session` | NONE | The dashboard editor cannot access `game_session` records. |
| `game_token` | NONE | The dashboard editor cannot change or view `game_token` records. |
| `game_version` | VIEW | View records for games accessible through the `dashboard_template` record to which this user has access. |
| `group` | NONE | A dashboard editor does not have access to `group` records. |
| `group_attempt` | NONE | A dashboard editor does not have access to `group_attempt` records. |
| `group_event` | NONE | A dashboard editor does not have access to `group_event` records. |
| `group_objective` | VIEW | View records for games accessible through the `dashboard_template` record to which this user has access. |
| `group_role` | NONE | A dashboard editor does not have access to `group_role` records. |
| `group_score` | NONE | A dashboard editor does not have access to `group_score` records. |
| `learning_goal` | VIEW | View records for games accessible through the `dashboard_template` record to which this user has access. |
| `mission_event` | NONE | A dashboard editor does not have access to `mission_event` records. |
| `organization` | NONE | Dashboard editors do not have access to the organization's information. |
| `organization_role` | NONE | Dashboard editors cannot view `organization_role` records. |
| `player` | NONE | A dashboard editor does not have access to `player` records. |
| `player_attempt` | NONE | A dashboard editor does not have access to `player_attempt` records. |
| `player_event` | NONE | A dashboard editor does not have access to `player_event` records. |
| `player_objective` | VIEW | View records for games accessible through the `dashboard_template` record to which this user has access. |
| `player_score` | NONE | A dashboard editor does not have access to `player_score` records. |
| `property_value` | CREATE | Create, edit and delete `property_value` records for `dashboard_template` records to which the user has EDIT access. |
| `scale` | VIEW | View records for games accessible through the `dashboard_template` record to which this user has access. |
| `session_role` | NONE | The dashboard editor does not have access to users or roles. |
| `template_element` | CREATE | Create, edit and delete `template_element` records for `dashboard_template` records to which the user has EDIT access. |
| `user` | NONE | Dashboard editors cannot access other users. |


## <a name="view"></a>Dashboard `view` role

A `dashboard` viewer is given read access to a **single dashboard**. No changes to any element can be made, though. Dashboard viewers do not have access to other users or roles, nor to sessions or game play data. When an `dashboard_role` with **view** rights has been defined for a `user`, the user has the following access to the database tables:

| Table | Access | Explanation |
| ----- | ------ | ----------- |
| `access_token` | NONE | Dashboard viewers cannot see access tokens. |
| `dashboard` | VIEW | Dashboard viewers can view dashboards linked to their `dashboard_template` access. |
| `dashboard_element` | VIEW | All dashboard viewers can view all existing dashboard elements (these are defined with backend code changes). |
| `dashboard_layout` | VIEW | All dashboard viewers can view all the existing dashboard layouts (these are defined with backend code changes). |
| `dashboard_role` | NONE | Dashboard viewers cannot see dashboard roles. |
| `dashboard_session` | NONE | Dashboard viewers cannot see dashboard sessions. |
| `dashboard_template` | VIEW | View the `dashboard_template` record to which the user has access. |
| `dashboard_token` | VIEW | Dashboard viewers can view dashboard tokens for all dashboards they have access to. |
| `element_property` | VIEW | All game access viewers can view all the existing element properties (these are defined with backend code changes). |
| `game` | VIEW | View `game` records for the `dashboard_template` record to which this user has access. This also gives VIEW access to corresponding records in: `game_version`, `game_mission`, `learning_goal`, `player_objective`, `group_objective`, and `scale` |
| `game_access`  | NONE | The dashboard viewer cannot access `game_access` records. |
| `game_access_role` | NONE | The dashboard viewer cannot access `game_access_role` records. |
| `game_mission` | VIEW | View records for games accessible through the `dashboard_template` record to which this user has access. |
| `game_role` | NONE | The dashboard viewer cannot access `game_role` records. |
| `game_session` | NONE | The dashboard viewer cannot access `game_session` records. |
| `game_token` | NONE | The dashboard viewer cannot change or view `game_token` records. |
| `game_version` | VIEW | View records for games accessible through the `dashboard_template` record to which this user has access. |
| `group` | NONE | A dashboard viewer does not have access to `group` records. |
| `group_attempt` | NONE | A dashboard viewer does not have access to `group_attempt` records. |
| `group_event` | NONE | A dashboard viewer does not have access to `group_event` records. |
| `group_objective` | VIEW | View records for games accessible through the `dashboard_template` record to which this user has access. |
| `group_role` | NONE | A dashboard viewer does not have access to `group_role` records. |
| `group_score` | NONE | A dashboard viewer does not have access to `group_score` records. |
| `learning_goal` | VIEW | View records for games accessible through the `dashboard_template` record to which this user has access. |
| `mission_event` | NONE | A dashboard viewer does not have access to `mission_event` records. |
| `organization` | NONE | Dashboard viewers do not have access to the organization's information. |
| `organization_role` | NONE | Dashboard viewers cannot view `organization_role` records. |
| `player` | NONE | A dashboard viewer does not have access to `player` records. |
| `player_attempt` | NONE | A dashboard viewer does not have access to `player_attempt` records. |
| `player_event` | NONE | A dashboard viewer does not have access to `player_event` records. |
| `player_objective` | VIEW | View records for games accessible through the `dashboard_template` record to which this user has access. |
| `player_score` | NONE | A dashboard viewer does not have access to `player_score` records. |
| `property_value` | VIEW | View `property_value` records for `dashboard_template` records to which the user has access. |
| `scale` | VIEW | View records for games accessible through the `dashboard_template` record to which this user has access. |
| `session_role` | NONE | The dashboard viewer does not have access to users or roles. |
| `template_element` | VIEW | Create, edit and delete `template_element` records for `dashboard_template` records to which the user has access. |
| `user` | NONE | Dashboard viewers cannot access other users. 
