## Access to `Organization` tables

When an `organization_role` with **admin** rights has been defined for a `user`, the user can access the following tables:

| Table | Access | Explanation |
| ----- | ------ | ----------- |
| `organization` | EDIT | Editing of all fields, including `code`. New `code` should be unique, though. |
| `game_access`  | EDIT | Fields `name`, `token_forced`, and `anonymous_sessions` of **existing** `game_access` records. |
| `game_access_role` | CREATE | Create, edit and delete `game_access_role` records for existing `game_access` records. |
| `access_token` | CREATE | Create, edit and delete `access_token` records for existing `game_access` records. |
| `game` | VIEW | View `game` records for existing `game_access` records. This also gives VIEW access to corresponding records in: `game_version`, `game_mission`, `learning_goal`, `player_objective`, `group_objective`, and `scale` |
| `dashboard_template` | CREATE | Create, edit and delete `dashboard_template` records that have a relation to existing `game_access` records for the `organization`. The user can also create, edit and delete `template_element` and `property_value` records for `dashboard_template` records to which the user has CREATE access. |
| `dashboard_template` | VIEW | view `dashboard_template` records that do not have a relation to existing `game_access` records for the `organization`, but that do refer to games to which the `organization` has access and that are **not** private. The user can also view `template_element` and `property_value` records for `dashboard_template` records to which the user has VIEW access. |
| `dashboard` | CREATE | Organization admins can create, edit and delete dashboards for all templates they have access to (including those with VIEW access). |
| `dashboard_token` | CREATE | Organization admins can create, edit and delete dashboard tokens for all dashboards they have access to. |
| `dashboard_session` | CREATE | Organization admins can create, edit and delete `dashboard_session` records between all dashboards and game sessions they have access to. |
| `dashboard_layout` | VIEW | All organization admins can see the existing dashboard layouts (these are defined with backend code changes). |
| `dashboard_element` | VIEW | All organization admins can see the existing dashboard elements (these are defined with backend code changes). |
| `element_property` | VIEW | All organization admins can see the existing element properties (these are defined with backend code changes). |
| `game_session` | CREATE | Create, edit and delete `game_session` records for existing `game_access` records. |
| game data | VIEW | View data for `mission_event`, `group_attempt`, `group_event`, `group_score`, `group`, `group_role`, `player`, `player_event` and `player_score` for all `game_session` records belonging to the `game_access` records of the `organization`. |

