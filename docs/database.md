# gamedata database

## Technical details
The gamedata database is implemented in mysql / mariadb as a relational SQL database. The database is typically hosted on the same server as the web environment for the gamedata platform, ensuring that the data does not have to be transferred over a network link. The database schema is called `gamedata` and it needs one user called `gamedata` to access the sables for reading and writing.

## Tables
The database has the following tables:

* `User`: users can login to the platform to do administration, define game sessions, obtain scores on game play, and retrieve data.
* `Organization`: A `User` can belong to an `Organization`, and an `Organization` can have access to one or more instances of `Game` and one or more instances of `GameSession`.
* `Game`: a game is an on-line playable application. It can be a SCORM file, a Web hosted game, a mobile game, or otherwise. The gamedata platform does not host the games -- this is done on a server or via a LMS.
* `GameRole`: A role that a `User` can play for a `Game`, e.g., maintaining the `Game` or having permission to look at the scores for that `Game`.
* `GameVersion`: A version of a `Game`. A version can indicate a `Game` in another language, a `Game` with other features, or sometimes a `Game` deployed for another `Organization`, e.g., using branding.
* `DashboardSettings`: These belong to a `Game` and indicate ways in which the game results are shown on dashboards. **Note:** it is probably better to make `DashboardSettings` dependent on the `GameVersion` or even the `GameMission` and link them to an `Organization` as well, so different organizations can display the results in different ways.
* `OrganizationToken`: A token is a string that replaces a username/password to upload data into the gamedata platform. Tokens can be deleted, after which they cannot be used anymore to provide data to the platform. Tokens prevent the open sending of usernames and passwords over the network, and are much more fine-grained than the users for the platform.
* `GameMission`: Missions are separate parts of a `GameVersion` that can be finished, and for which an 'end score' can be calculated. In some cases, rounds of a game are missions, in other cases, rounds do not have separate scores that are to be shown on a leaderboard. When defining a game, administrators do not have restrictions in defining one or several missions for a game. A mission serves as a 'reporting unit' for a game.
* `GameSession`: sessions are occasions where one or more players who belong to an `Organization`, in groups or individually, play a certain `Game` where the results are stored in the platform for that `Game` and that `Organization`.
