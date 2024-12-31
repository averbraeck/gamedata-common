# Database access and roles

Access has been defined through roles. Each user can have multiple roles, defined in five role tables and one attribute within user:

![](20241231_User.png)

The following rights exist:
- `user.super_admin`: complete rights; defined in the `user` table. See [role super-admin](role_super_admin.md)
- `user.game_admin`: maximum rights as a game admin; defined in the `user` table. See [role game-admin](role_game.md#admin)
- `game_role.edit`: editing rights to existing games; no user/role rights. See [role game-edit](role_game.md#edit)
- `game_role.view`: only viewing rights for a game as a game user. See [role game-view](role_game.md#view)
- `organization_role.admin`: maximum rights as an organizational user. See [role organization-admin](role_organization.md#admin)
- `organization_role.edit`: editing rights to dashboard templates and game sessions; no user/role rights. See [role organization-edit](role_organization.md#edit)
- `organization_role.view`: only viewing rights as an organizational user. See [role organization-view](role_organization.md#view)
- `organization_game_role.edit`: editing rights per single game for an organization; no user/role rights. See [role organization-game-edit](role_organization_game.md#edit)
- `organization_game_role.view`: only viewing rights for a single game for an organization. See [role organization-game-view](role_organization_game.md#view)
- `game_session_role.edit`: editing rights per single game session; no user/role rights. See [role game-session-edit](role_game_session.md#edit)
- `game_session_role.view`: only viewing rights for a single game session. See [role game-session-view](role_game_session.md#view)
- `dashboard_role.edit`: editing rights per single `dashboard_template`; no user/role rights. See [role dashboard-edit](role_dashboard.md#edit)
- `dashboard_role.view`: only viewing rights for a single `dashboard_template`. See [role dashboard-view](role_dashboard.md#view)
