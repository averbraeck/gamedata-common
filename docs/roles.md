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

For each `OrganizationRole`, for each corresponding `Organization` (just 1), for each `GameAccess` (multiple), for the corresponding `Game` (just 1):

- VIEW role for that game (no editing rights on games from an organization).

For each `GameAccessRole`, for the corresponding `GameAccess` (just 1), for the corresponding `Game` (just 1):

- VIEW role for that game (no editing rights on games from a game_access definition).

For each `SessionRole`, for the corresponding `GameSession` (just 1), for the corresponding `GameVersion` (just 1), for the corresponding `Game` (just 1):

- VIEW role for that game (no editing rights on games from a game session).

For each `DashboardRole`, for the corresponding `GameTemplate` (just 1), for the corresponding `GameVersion` (just 1), for the corresponding `Game` (just 1):

- VIEW role for that game (no editing rights on games from a dashboard template).


### GameAccess access (probably not needed)

If `User.super_admin`:

- CREATE, EDIT role for all game-access.

For each `GameAccessRole`, for the corresponding `GameAccess` (just 1):

- if `GameAccessRole.edit`: EDIT role for that `GameAccess`.
- if `GameAccessRole.view`: VIEW role for that `GameAccess`.

For each `OrganizationRole`, for each corresponding `Organization` (just 1), for each `GameAccess` (multiple):

- if `GameAccessRole.edit`: EDIT role for that `GameAccess`.
- if `GameAccessRole.view`: VIEW role for that `GameAccess`.


### GameSession access

If `User.super_admin`:

- CREATE, EDIT role for all game sessions.

For each `SessionRole`, for the corresponding `GameSession` (just 1):

- if `SessionRole.edit`: EDIT role for that `GameAccess`.
- if `SessionRole.view`: VIEW role for that `GameAccess`.

