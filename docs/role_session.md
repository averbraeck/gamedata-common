# <a name="edit"></a>Game Session roles

## Game Session `edit` role

A `game_session` editor is given access to a **single game session** for an organization. The user with a game session edit role can use defined dashboards for that session, and see the game session and the corresponding data. They do not have access to other users, roles, games, or the organization itself. When an `session_role` with **edit** rights has been defined for a `user`, the user has the following access to the database tables:

| Table | Access | Explanation |
| ----- | ------ | ----------- |
| `access_token` | NONE | Game session editors cannot see access tokens. |
| `dashboard` | VIEW | Game session editors can view dashboards linked to their session. |
| `dashboard_element` | NONE | Game session editors cannot see dashboard elements. |
| `dashboard_layout` | NONE | Game session editors cannot see dashboard layouts. |
| `dashboard_role` | NONE | Game session editors cannot see dashboard roles. |
| `dashboard_session` | VIEW | Game session editors can view `dashboard_session` records for their session. |
| `dashboard_template` | NONE | Game session editors cannot see dashboard templates. |
| `dashboard_token` | NONE | Game session editors cannot see dashboard tokens. |
| `element_property` | NONE | Game session editors cannot see element properties. |
| `game` | VIEW | View `game` records for the `game_session` record to which this user has access. This also gives VIEW access to corresponding records in: `game_version`, `game_mission`, `learning_goal`, `player_objective`, `group_objective`, and `scale` |
| `game_access`  | NONE | The game session editor cannot access `game_access` records. |
| `game_access_role` | NONE | The game session editor cannot access `game_access_role` records. |
| `game_mission` | VIEW | View records for games accessible through the `game_session` record to which this user has access. |
| `game_role` | NONE | The game session editor cannot access `game_role` records. |
| `game_session` | EDIT | Edit the `game_session` record to which this user has access. The user cannot delete the record. |
| `game_token` | NONE | The game session editor cannot change or even view `game_token` records. |
| `game_version` | VIEW | View records for games accessible through the `game_session` record to which this user has access. |
| `group` | VIEW | View data for the `game_session` record to which this user has access. |
| `group_attempt` | VIEW | View data for the `game_session` record to which this user has access. |
| `group_event` | VIEW | View data for the `game_session` record to which this user has access. |
| `group_objective` | VIEW | View records for games accessible through the `game_session` record to which this user has access. |
| `group_role` | VIEW | View data for the `game_session` record to which this user has access. |
| `group_score` | VIEW | View data for the `game_session` record to which this user has access. |
| `learning_goal` | VIEW | View records for games accessible through the `game_session` record to which this user has access. |
| `mission_event` | VIEW | View data for the `game_session` record to which this user has access. |
| `organization` | NONE | Game session editors do not have access to the organization's information. |
| `organization_role` | NONE | Game session editors cannot view `organization_role` records. |
| `player` | VIEW | View data for the `game_session` record to which this user has access. |
| `player_attempt` | VIEW | View data for the `game_session` record to which this user has access. |
| `player_event` | VIEW | View data for the `game_session` record to which this user has access. |
| `player_objective` | VIEW | View records for games accessible through the `game_session` record to which this user has access. |
| `player_score` | VIEW | View data for the `game_session` record to which this user has access. |
| `property_value` | NONE | Game session editors cannot see property values. |
| `scale` | VIEW | View records for games accessible through the `game_session` record to which this user has access. |
| `session_role` | NONE | The game session editor does not have access to users or roles. |
| `template_element` | NONE | Game session editors cannot see template elements. |
| `user` | NONE | Game session editors cannot access other users. |


## <a name="view"></a>Game Session `view` role

A `game_session` viewer is given read access to a **single game session** for an organization. No changes to any element can be made, though. Game session viewers do not have access to other users or roles, nor to the definition of dashboards. When an `session_role` with **view** rights has been defined for a `user`, the user has the following access to the database tables:

| Table | Access | Explanation |
| ----- | ------ | ----------- |
| `access_token` | NONE | Game session viewers cannot see access tokens. |
| `dashboard` | VIEW | Game session viewers can view dashboards linked to their session. |
| `dashboard_element` | NONE | Game session viewers cannot see dashboard elements. |
| `dashboard_layout` | NONE | Game session viewers cannot see dashboard layouts. |
| `dashboard_role` | NONE | Game session viewers cannot see dashboard roles. |
| `dashboard_session` | VIEW | Game session viewers can view `dashboard_session` records for their session. |
| `dashboard_template` | NONE | Game session viewers cannot see dashboard templates. |
| `dashboard_token` | NONE | Game session viewers cannot see dashboard tokens. |
| `element_property` | NONE | Game session viewers cannot see element properties. |
| `game` | VIEW | View `game` records for the `game_session` record to which this user has access. This also gives VIEW access to corresponding records in: `game_version`, `game_mission`, `learning_goal`, `player_objective`, `group_objective`, and `scale` |
| `game_access`  | NONE | The game session viewer cannot access `game_access` records. |
| `game_access_role` | NONE | The game session viewer cannot access `game_access_role` records. |
| `game_mission` | VIEW | View records for games accessible through the `game_session` record to which this user has access. |
| `game_role` | NONE | The game session viewer cannot access `game_role` records. |
| `game_session` | VIEW | View the `game_session` record to which this user has access. The user cannot delete the record. |
| `game_token` | NONE | The game session viewer cannot change or even view `game_token` records. |
| `game_version` | VIEW | View records for games accessible through the `game_session` record to which this user has access. |
| `group` | VIEW | View data for the `game_session` record to which this user has access. |
| `group_attempt` | VIEW | View data for the `game_session` record to which this user has access. |
| `group_event` | VIEW | View data for the `game_session` record to which this user has access. |
| `group_objective` | VIEW | View records for games accessible through the `game_session` record to which this user has access. |
| `group_role` | VIEW | View data for the `game_session` record to which this user has access. |
| `group_score` | VIEW | View data for the `game_session` record to which this user has access. |
| `learning_goal` | VIEW | View records for games accessible through the `game_session` record to which this user has access. |
| `mission_event` | VIEW | View data for the `game_session` record to which this user has access. |
| `organization` | NONE | Game session viewers do not have access to the organization's information. |
| `organization_role` | NONE | Game session viewers cannot view `organization_role` records. |
| `player` | VIEW | View data for the `game_session` record to which this user has access. |
| `player_attempt` | VIEW | View data for the `game_session` record to which this user has access. |
| `player_event` | VIEW | View data for the `game_session` record to which this user has access. |
| `player_objective` | VIEW | View records for games accessible through the `game_session` record to which this user has access. |
| `player_score` | VIEW | View data for the `game_session` record to which this user has access. |
| `property_value` | NONE | Game session viewers cannot see property values. |
| `scale` | VIEW | View records for games accessible through the `game_session` record to which this user has access. |
| `session_role` | NONE | The game session viewer does not have access to users or roles. |
| `template_element` | NONE | Game session viewers cannot see template elements. |
| `user` | NONE | Game session viewers cannot access other users. |

