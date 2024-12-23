# <a name="admin"></a>User role as super_admin

When a `super_admin` role has been defined for a `user`, the user has the following access to the database tables:

| Table | Access | Explanation |
| ----- | ------ | ----------- |
| `dashboard` | CREATE | Create, edit and delete all dashboards for all templates. |
| `dashboard_element` | CREATE | Create, edit and delete all dashboard elements (these are defined with backend code changes). |
| `dashboard_layout` | CREATE | Create, edit and delete all dashboard layouts (these are defined with backend code changes). |
| `dashboard_role` | CREATE | Create, edit and delete for all dashboard roles. |
| `dashboard_session` | CREATE | Create, edit and delete all `dashboard_session` records. |
| `dashboard_template` | CREATE | Create, edit and delete all `dashboard_template` records. |
| `dashboard_token` | CREATE | Create, edit and delete all dashboard tokens for all dashboards. |
| `element_property` | CREATE | Create, edit and delete all element properties (these are defined with backend code changes). |
| `game` | CREATE | Create, edit and delete games. Any new game `code` should be unique. |
| `game_mission` | CREATE | Create, edit and delete all `organization_game` records. |
| `game_role` | CREATE | Create, edit and delete all `game_role` records. |
| `game_session` | CREATE | Create, edit and delete all `game_session` records. |
| `game_session_role` | CREATE | Create, edit and delete all `game_session_role` records. |
| `game_token` | CREATE | Create, edit and delete all `game_token` records. |
| `game_version` | CREATE | Create, edit and delete all `game_version` records. |
| `group` | EDIT | View or edit data for all `group` records. |
| `group_attempt` | EDIT | View or edit data for all `group_attempt` records. |
| `group_event` | EDIT | View or edit data for all `group_event` records. |
| `group_objective` | CREATE | Create, edit and delete all `group_objective` records. |
| `group_role` | EDIT | View or edit data for all `group_role` records. |
| `group_score` | EDIT | View or edit data for all `group_score` records. |
| `learning_goal` | EDIT | View or edit all `learning_goal` records. |
| `mission_event` | EDIT | View or edit data for all `mission_event` records. |
| `organization` | CREATE | Create, edit and delete organizations, including `code`. Any new organization `code` should be unique. |
| `organization_game`  | CREATE | Create, edit and delete all `organization_game` records. |
| `organization_game_role` | CREATE | Create, edit and delete all `organization_game_role` records. |
| `organization_game_token` | CREATE | Create, edit and delete `organization_game_token` records for all `organization_game` records. |
| `organization_role` | CREATE | Create, edit, and delete `organization_role` records for any existing users in the database. |
| `player` | EDIT | View or edit data for all `player` records. |
| `player_attempt` | EDIT | View or edit data for all `player_attempt` records. |
| `player_event` | EDIT | View or edit data for all `player_event` records. |
| `player_objective` | CREATE | Create, edit and delete all records for player objectives. |
| `player_score` | EDIT | View or edit data for all `player_score` records. |
| `property_value` | CREATE | Create, edit and delete all `property_value` records. |
| `scale` | CREATE | Create, edit and delete all records for game-specific scales. |
| `template_element` | CREATE | Create, edit and delete `template_element` records. |
| `user` | CREATE | Create, edit and delete all users in the database. Any new user `name` should be unique. |

