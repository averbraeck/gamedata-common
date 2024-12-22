# <a name="admin"></a>Organizational roles

## Organization `admin` role

When an `organization_role` with **admin** rights has been defined for a `user`, the user has the following access to the database tables:

| Table | Access | Explanation |
| ----- | ------ | ----------- |
| `access_token` | CREATE | Create, edit and delete `access_token` records for existing `game_access` records. NONE access to records not linked to the organization and its games. |
| `dashboard` | CREATE | Organization admins can create, edit and delete dashboards for all templates they have access to (including those with VIEW access). NONE access to records not linked to the organization's games. |
| `dashboard_element` | VIEW | All organization admins can view all existing dashboard elements (these are defined with backend code changes). |
| `dashboard_layout` | VIEW | All organization admins can view all the existing dashboard layouts (these are defined with backend code changes). |
| `dashboard_role` | CREATE | Organization admins can create, edit and delete dashboard roles for all templates they have CREATE access to. |
| `dashboard_session` | CREATE | Organization admins can create, edit and delete `dashboard_session` records between all dashboards and game records to which they have access |
| `dashboard_template` | CREATE | Create, edit and delete `dashboard_template` records that have a relation to existing `game_access` records for the `organization`. The user can also create, edit and delete `template_element` and `property_value` records for `dashboard_template` records to which the user has CREATE access. |
|   | VIEW | view `dashboard_template` records that do not have a relation to existing `game_access` records for the `organization`, but that do refer to games to which the `organization` has access and that are **not** private. The user can also view `template_element` and `property_value` records for `dashboard_template` records to which the user has VIEW access. |
| `dashboard_token` | CREATE | Organization admins can create, edit and delete dashboard tokens for all dashboards they have access to. |
| `element_property` | VIEW | All organization admins can view all the existing element properties (these are defined with backend code changes). |
| `game` | VIEW | View `game` records for existing `game_access` records. This also gives VIEW access to corresponding records in: `game_version`, `game_mission`, `learning_goal`, `player_objective`, `group_objective`, and `scale` |
| `game_access`  | EDIT | Fields `name`, `token_forced`, and `anonymous_sessions` of **existing** `game_access` records. |
| `game_access_role` | CREATE | Create, edit and delete `game_access_role` records for existing `game_access` records. |
| `game_mission` | VIEW | View records for games accessible through existing `game_access` records. |
| `game_role` | NONE | The organization admin cannot change or even view `game_role` records. |
| `game_session` | CREATE | Create, edit and delete `game_session` records for existing `game_access` records. |
| `game_token` | NONE | The organization admin cannot change or even view `game_token` records. |
| `game_version` | VIEW | View records for games accessible through existing `game_access` records. |
| `group` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `group_attempt` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `group_event` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `group_objective` | VIEW | View records for games accessible through existing `game_access` records. |
| `group_role` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `group_score` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `learning_goal` | VIEW | View records for games accessible through existing `game_access` records. |
| `mission_event` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `organization` | EDIT | Editing of all fields, including `code`. Any new `code` should be unique, though. |
| `organization_role` | CREATE | Organization admins can create, edit, and delete `organization_role` records for their own organization, and any existing users in the database. |
| `player` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `player_attempt` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `player_event` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `player_objective` | VIEW | View records for games accessible through existing `game_access` records. |
| `player_score` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `property_value` | CREATE | Create, edit and delete `property_value` records for `dashboard_template` records to which the user has CREATE access. |
|   | VIEW | View `property_value` records for `dashboard_template` records to which the user has VIEW access. |
| `scale` | VIEW | View records for games accessible through existing `game_access` records. |
| `session_role` | CREATE | Create, edit and delete `session_role` records between existing and accessible `game_access` records and existing and users. |
| `template_element` | CREATE | Create, edit and delete `template_element` records for `dashboard_template` records to which the user has CREATE access. |
|   | VIEW | View `template_element` records for `dashboard_template` records to which the user has VIEW access. |
| `user` | CREATE | Organization admins can create **but not edit or delete** new users, and view all existing users in the database. |


## <a name="edit"></a>Organization `edit` role

An organization editor can access all games that the organization has access to, and define (create, edit, delete) dashboards and game sessions. They do not have access to other users or any roles. If you want to give this access to a single game, provide EDIT rights to the user through the `game_access` table, where access can be provided per game. For even more fine grained access, edit rights can be given for individual dashboards and/or game sessions. When an `organization_role` with **edit** rights has been defined for a `user`, the user has the following access to the database tables:

| Table | Access | Explanation |
| ----- | ------ | ----------- |
| `access_token` | CREATE | Create, edit and delete `access_token` records for existing `game_access` records. NONE access to records not linked to the organization and its games. |
| `dashboard` | CREATE | Organization editors can create, edit and delete dashboards for all templates they have access to (including those with VIEW access). NONE access to records not linked to the organization's games. |
| `dashboard_element` | VIEW | All organization editors can view all existing dashboard elements (these are defined with backend code changes). |
| `dashboard_layout` | VIEW | All organization editors can view all the existing dashboard layouts (these are defined with backend code changes). |
| `dashboard_role` | NONE | Organization editors cannot see dashboard roles. |
| `dashboard_session` | CREATE | Organization editors can create, edit and delete `dashboard_session` records between all dashboards and game records to which they have access |
| `dashboard_template` | CREATE | Create, edit and delete `dashboard_template` records that have a relation to existing `game_access` records for the `organization`. The user can also create, edit and delete `template_element` and `property_value` records for `dashboard_template` records to which the user has CREATE access. |
|   | VIEW | view `dashboard_template` records that do not have a relation to existing `game_access` records for the `organization`, but that do refer to games to which the `organization` has access and that are **not** private. The user can also view `template_element` and `property_value` records for `dashboard_template` records to which the user has VIEW access. |
| `dashboard_token` | CREATE | Organization editors can create, edit and delete dashboard tokens for all dashboards they have access to. |
| `element_property` | VIEW | All organization editors can view all the existing element properties (these are defined with backend code changes). |
| `game` | VIEW | View `game` records for existing `game_access` records. This also gives VIEW access to corresponding records in: `game_version`, `game_mission`, `learning_goal`, `player_objective`, `group_objective`, and `scale` |
| `game_access`  | NONE | The organization editor cannot access`game_access` records. |
| `game_access_role` | NONE | The organization editor cannot access`game_access_role` records. |
| `game_mission` | VIEW | View records for games accessible through existing `game_access` records. |
| `game_role` | NONE | The organization editor cannot access `game_role` records. |
| `game_session` | CREATE | Create, edit and delete `game_session` records for existing `game_access` records. |
| `game_token` | NONE | The organization editor cannot change or even view `game_token` records. |
| `game_version` | VIEW | View records for games accessible through existing `game_access` records. |
| `group` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `group_attempt` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `group_event` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `group_objective` | VIEW | View records for games accessible through existing `game_access` records. |
| `group_role` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `group_score` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `learning_goal` | VIEW | View records for games accessible through existing `game_access` records. |
| `mission_event` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `organization` | VIEW | Organization editors can view but not change the organization's information. |
| `organization_role` | NONE | Organization editors cannot view `organization_role` records. |
| `player` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `player_attempt` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `player_event` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `player_objective` | VIEW | View records for games accessible through existing `game_access` records. |
| `player_score` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `property_value` | CREATE | Create, edit and delete `property_value` records for `dashboard_template` records to which the user has CREATE access. |
|   | VIEW | View `property_value` records for `dashboard_template` records to which the user has VIEW access. |
| `scale` | VIEW | View records for games accessible through existing `game_access` records. |
| `session_role` | NONE | The organization editor does not have access to users or roles. |
| `template_element` | CREATE | Create, edit and delete `template_element` records for `dashboard_template` records to which the user has CREATE access. |
|   | VIEW | View `template_element` records for `dashboard_template` records to which the user has VIEW access. |
| `user` | NONE | Organization editors cannot access other users. |

## <a name="view"></a>Organization `view` role

An organization viewer can access all games that the organization has access to, as well as dashboards and game sessions. No changes to any element can be made, though. Organization viewers do not have access to other users or any roles. When an `organization_role` with **view** rights has been defined for a `user`, the user has the following access to the database tables:

| Table | Access | Explanation |
| ----- | ------ | ----------- |
| `access_token` | VIEW | View `access_token` records for existing `game_access` records. NONE access to records not linked to the organization and its games. |
| `dashboard` | VIEW | Organization viewers can view dashboards for all templates they have access to. NONE access to records not linked to the organization's games. |
| `dashboard_element` | VIEW | All organization viewers can view all existing dashboard elements (these are defined with backend code changes). |
| `dashboard_layout` | VIEW | All organization viewers can view all the existing dashboard layouts (these are defined with backend code changes). |
| `dashboard_role` | NONE | Organization viewers cannot see dashboard roles. |
| `dashboard_session` | VIEW | Organization viewers can view `dashboard_session` records between all dashboards and game records to which they have access |
| `dashboard_template` | VIEW | View `dashboard_template` records that have a relation to existing `game_access` records for the `organization`. |
| `dashboard_token` | VIEW | Organization viewers can view dashboard tokens for all dashboards they have access to. |
| `element_property` | VIEW | All organization viewers can view all the existing element properties (these are defined with backend code changes). |
| `game` | VIEW | View `game` records for existing `game_access` records. This also gives VIEW access to corresponding records in: `game_version`, `game_mission`, `learning_goal`, `player_objective`, `group_objective`, and `scale` |
| `game_access`  | NONE | The organization viewer cannot access`game_access` records. |
| `game_access_role` | NONE | The organization viewer cannot access`game_access_role` records. |
| `game_mission` | VIEW | View records for games accessible through existing `game_access` records. |
| `game_role` | NONE | The organization viewer cannot access `game_role` records. |
| `game_session` | VIEW | View `game_session` records for existing `game_access` records. |
| `game_token` | NONE | The organization viewer cannot change or even view `game_token` records. |
| `game_version` | VIEW | View records for games accessible through existing `game_access` records. |
| `group` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `group_attempt` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `group_event` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `group_objective` | VIEW | View records for games accessible through existing `game_access` records. |
| `group_role` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `group_score` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `learning_goal` | VIEW | View records for games accessible through existing `game_access` records. |
| `mission_event` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `organization` | VIEW | Organization viewers can view but not change the organization's information. |
| `organization_role` | NONE | Organization viewers cannot view `organization_role` records. |
| `player` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `player_attempt` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `player_event` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `player_objective` | VIEW | View records for games accessible through existing `game_access` records. |
| `player_score` | VIEW | View data for all `game_session` records belonging to the `game_access` records of the `organization`. |
| `property_value` | VIEW | View `property_value` records for `dashboard_template` records to which the user has VIEW access. |
| `scale` | VIEW | View records for games accessible through existing `game_access` records. |
| `session_role` | NONE | The organization viewer does not have access to users or roles. |
| `template_element` | VIEW | View `template_element` records for `dashboard_template` records to which the user has VIEW access. |
| `user` | NONE | Organization viewers cannot access or see other users. |

