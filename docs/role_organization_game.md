# <a name="edit"></a>Organization Game roles

## Organization Game `edit` role

A `organization_game` editor is given access to a **single game** for an organization. The user with a organization_game edit role can define (create, edit, delete) dashboards and game sessions for that game combined with that organization only. They do not have access to other users, roles, games, or the organization itself. When an `organization_game_role` with **edit** rights has been defined for a `user`, the user has the following access to the database tables:

| Table | Access | Explanation |
| ----- | ------ | ----------- |
| `dashboard` | CREATE | Organization game editors can create, edit and delete dashboards for all templates they have access to through their combination of game and organization (including those with VIEW access). NONE access to records not linked to the combination of game and organization. |
| `dashboard_element` | VIEW | All organization game editors can view all existing dashboard elements (these are defined with backend code changes). |
| `dashboard_layout` | VIEW | All organization game editors can view all the existing dashboard layouts (these are defined with backend code changes). |
| `dashboard_role` | NONE | Organization game editors cannot see dashboard roles. |
| `dashboard_session` | CREATE | Organization game editors can create, edit and delete `dashboard_session` records between all dashboards and game records to which they have access |
| `dashboard_template` | CREATE | Create, edit and delete `dashboard_template` records that have a relation to the `organization_game` record to which the user has access. The user can also create, edit and delete `template_element` and `property_value` records for `dashboard_template` records to which the user has CREATE access. The access is NONE for other templates. |
| `dashboard_token` | CREATE | Organization game editors can create, edit and delete dashboard tokens for all dashboards they have access to. |
| `element_property` | VIEW | All organization game editors can view all the existing element properties (these are defined with backend code changes). |
| `game` | VIEW | View `game` records for the `organization_game` record to which this user has access. This also gives VIEW access to corresponding records in: `game_version`, `game_mission`, `learning_goal`, `player_objective`, `group_objective`, and `scale` |
| `game_mission` | VIEW | View records for games accessible through the `organization_game` record to which this user has access. |
| `game_role` | NONE | The organization game editor cannot access `game_role` records. |
| `game_session` | CREATE | Create, edit and delete `game_session` records for the `organization_game` record to which this user has access. |
| `game_session_role` | NONE | The organization game editor does not have access to users or roles. |
| `game_token` | NONE | The organization game editor cannot change or even view `game_token` records. |
| `game_version` | VIEW | View records for games accessible through the `organization_game` record to which this user has access. |
| `group` | VIEW | View data for all `game_session` records belonging to the `organization_game` record to which this user has access. |
| `group_attempt` | VIEW | View data for all `game_session` records belonging to the `organization_game` record to which this user has access. |
| `group_event` | VIEW | View data for all `game_session` records belonging to the `organization_game` record to which this user has access. |
| `group_objective` | VIEW | View records for games accessible through the `organization_game` record to which this user has access. |
| `group_role` | VIEW | View data for all `game_session` records belonging to the `organization_game` record to which this user has access. |
| `group_score` | VIEW | View data for all `game_session` records belonging to the `organization_game` record to which this user has access. |
| `learning_goal` | VIEW | View records for games accessible through the `organization_game` record to which this user has access. |
| `mission_event` | VIEW | View data for all `game_session` records belonging to the `organization_game` record to which this user has access. |
| `organization` | NONE | Organization game editors do not have access to the organization's information. |
| `organization_game`  | NONE | The organization game editor cannot access `organization_game` records. |
| `organization_game_role` | NONE | The organization game editor cannot access `organization_game_role` records. |
| `organization_game_token` | CREATE | Create, edit and delete `organization_game_token` records for the `organization_game` record for which the role has been defined. NONE access to records not linked to the organization game record. |
| `organization_role` | NONE | Organization game editors cannot view `organization_role` records. |
| `player` | VIEW | View data for all `game_session` records belonging to the `organization_game` record to which this user has access. |
| `player_attempt` | VIEW | View data for all `game_session` records belonging to the `organization_game` record to which this user has access. |
| `player_event` | VIEW | View data for all `game_session` records belonging to the `organization_game` record to which this user has access. |
| `player_objective` | VIEW | View records for games accessible through the `organization_game` record to which this user has access. |
| `player_score` | VIEW | View data for all `game_session` records belonging to the `organization_game` record to which this user has access. |
| `property_value` | CREATE | Create, edit and delete `property_value` records for `dashboard_template` records to which the user has CREATE access. |
|   | VIEW | View `property_value` records for `dashboard_template` records to which the user has VIEW access. |
| `scale` | VIEW | View records for games accessible through the `organization_game` record to which this user has access. |
| `template_element` | CREATE | Create, edit and delete `template_element` records for `dashboard_template` records to which the user has CREATE access. |
|   | VIEW | View `template_element` records for `dashboard_template` records to which the user has VIEW access. |
| `user` | NONE | Organization game editors cannot access other users. |

## <a name="view"></a>Organization Game `view` role

A organization game viewer can access all games that the organization has access to, as well as dashboards and game sessions. No changes to any element can be made, though. Organization game viewers do not have access to other users or any roles. When a `organization_game_role` with **view** rights has been defined for a `user`, the user has the following access to the database tables:

| Table | Access | Explanation |
| ----- | ------ | ----------- |
| `dashboard` | VIEW | Organization game viewers can view dashboards for all templates they have access to through their combination of game and organization (including those with VIEW access). NONE access to records not linked to the combination of game and organization. |
| `dashboard_element` | VIEW | All organization game viewers can view all existing dashboard elements (these are defined with backend code changes). |
| `dashboard_layout` | VIEW | All organization game viewers can view all the existing dashboard layouts (these are defined with backend code changes). |
| `dashboard_role` | NONE | Organization game viewers cannot see dashboard roles. |
| `dashboard_session` | VIEW | Organization game viewers can view `dashboard_session` records between all dashboards and game records to which they have access |
| `dashboard_template` | VIEW | View `dashboard_template` records that have a relation the `organization_game` record to which the role provides access. The access is NONE for other templates. |
| `dashboard_token` | VIEW | Organization game viewers can view dashboard tokens for all dashboards they have access to. |
| `element_property` | VIEW | All organization game viewers can view all the existing element properties (these are defined with backend code changes). |
| `game` | VIEW | View `game` records for the `organization_game` record to which this user has access. This also gives VIEW access to corresponding records in: `game_version`, `game_mission`, `learning_goal`, `player_objective`, `group_objective`, and `scale` |
| `game_mission` | VIEW | View records for games accessible through the `organization_game` record to which this user has access. |
| `game_role` | NONE | The organization game viewer cannot access `game_role` records. |
| `game_session` | VIEW | View `game_session` records for the `organization_game` record to which this user has access. |
| `game_session_role` | NONE | The organization game viewer does not have access to users or roles. |
| `game_token` | NONE | The organization game viewer cannot change or even view `game_token` records. |
| `game_version` | VIEW | View records for games accessible through the `organization_game` record to which this user has access. |
| `group` | VIEW | View data for all `game_session` records belonging to the `organization_game` record to which this user has access. |
| `group_attempt` | VIEW | View data for all `game_session` records belonging to the `organization_game` record to which this user has access. |
| `group_event` | VIEW | View data for all `game_session` records belonging to the `organization_game` record to which this user has access. |
| `group_objective` | VIEW | View records for games accessible through the `organization_game` record to which this user has access. |
| `group_role` | VIEW | View data for all `game_session` records belonging to the `organization_game` record to which this user has access. |
| `group_score` | VIEW | View data for all `game_session` records belonging to the `organization_game` record to which this user has access. |
| `learning_goal` | VIEW | View records for games accessible through the `organization_game` record to which this user has access. |
| `mission_event` | VIEW | View data for all `game_session` records belonging to the `organization_game` record to which this user has access. |
| `organization` | NONE | Organization game viewers do not have access to the organization's information. |
| `organization_game`  | NONE | The organization game viewer cannot access `organization_game` records. |
| `organization_game_role` | NONE | The organization game viewer cannot access `organization_game_role` records. |
| `game_organization_token` | VIEW | View `game_organization_token` records for the `organization_game` record to which this user has access. |
| `organization_role` | NONE | Organization game viewers cannot view `organization_role` records. |
| `player` | VIEW | View data for all `game_session` records belonging to the `organization_game` record to which this user has access. |
| `player_attempt` | VIEW | View data for all `game_session` records belonging to the `organization_game` record to which this user has access. |
| `player_event` | VIEW | View data for all `game_session` records belonging to the `organization_game` record to which this user has access. |
| `player_objective` | VIEW | View records for games accessible through the `organization_game` record to which this user has access. |
| `player_score` | VIEW | View data for all `game_session` records belonging to the `organization_game` record to which this user has access. |
| `property_value` | VIEW | View `property_value` records for `dashboard_template` records to which the user has VIEW access. |
| `scale` | VIEW | View records for games accessible through the `organization_game` record to which this user has access. |
| `template_element` | VIEW | View `template_element` records for `dashboard_template` records to which the user has VIEW access. |
| `user` | NONE | Organization game viewers cannot access or see other users. |
