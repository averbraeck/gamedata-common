# Roles with corresponding access in the code

The `AdminData` class prepares for each user to which organizations, games, organization-game combinations, sessions and dashboard they have access. 


### Organization access

If `User.super_admin`:

- CREATE, EDIT role for all organizations.

For each `OrganizationRole`:

- if `OrganizationRole.admin`: ADMIN role for that `organization`.
- if `OrganizationRole.edit`: EDIT role for that `organization`.
- if `OrganizationRole.view`: VIEW role for that `organization`.


### Game access

If `User.super_admin`:

- CREATE, EDIT role for all games.

If `User.game_admin`:

- CREATE role for new games.

For each `GameRole`:

- if `GameRole.edit`: EDIT role for that `game`.
- if `GameRole.view`: VIEW role for that `game`.

For each `OrganizationRole`, for each corresponding `GameAccess`, for each corresponding `Game`:

- VIEW role for that game (no editing rights on games from an organization).

For each `GameAccessRole`, for the corresponding `GameAccess`, for each corresponding `Game`:

- VIEW role for that game (no editing rights on games from game_access).

For each `SessionRole`, for the corresponding `GameSession`, for each corresponding `GameVersion`, for each corresponding `Game`:

- VIEW role for that game (no editing rights on games from game_access).

For each `DashboardRole`, for the corresponding `GameTemplate`, for each corresponding `GameVersion`, for each corresponding `Game`:

- VIEW role for that game (no editing rights on games from game_access).

