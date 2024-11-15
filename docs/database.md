# gamedata database

## Technical details

The gamedata database is implemented in mysql / mariadb as a relational SQL database. The database is typically hosted on the same server as the web environment for the gamedata platform, ensuring that the data does not have to be transferred over a network link. The database schema is called `gamedata` and it needs one user called `gamedata` to access the sables for reading and writing.


## Tables

The database has the following administrative tables that can be edited through the `gamedata-admin` web application:

* `User`: users can login to the platform to do administration, define game sessions, obtain scores on game play, and retrieve data.
* `Organization`: A `User` can belong to an `Organization`, and an `Organization` can have access to one or more instances of `Game` and one or more instances of `GameSession`.
* `Game`: a game is an on-line playable application. It can be a SCORM file, a Web hosted game, a mobile game, or otherwise. The gamedata platform does not host the games -- this is done on a server or via a LMS.
* `GameRole`: A role that a `User` can play for a `Game`, e.g., maintaining the `Game` or having permission to look at the scores for that `Game`.
* `GameVersion`: A version of a `Game`. A version can indicate a `Game` in another language, a `Game` with other features, or sometimes a `Game` deployed for another `Organization`, e.g., using branding.
* `DashboardSettings`: These belong to a `Game` and indicate ways in which the game results are shown on dashboards. **Note:** it is probably better to make `DashboardSettings` dependent on the `GameVersion` or even the `GameMission` and link them to an `Organization` as well, so different organizations can display the results in different ways.
* `OrganizationToken`: A token is a string that replaces a username/password to upload data into the gamedata platform. Tokens can be deleted, after which they cannot be used anymore to provide data to the platform. Tokens prevent the open sending of usernames and passwords over the network, and are much more fine-grained than the users for the platform.
* `GameMission`: Missions are separate parts of a `GameVersion` that can be finished, and for which an 'end score' can be calculated. In some cases, rounds of a game are missions, in other cases, rounds do not have separate scores that are to be shown on a leaderboard. When defining a game, administrators do not have restrictions in defining one or several missions for a game. A mission serves as a 'reporting unit' for a game.
* `GameSession`: sessions are occasions where one or more players who belong to an `Organization`, in groups or individually, play a certain `Game` where the results are stored in the platform for that `Game` and that `Organization`. The `GameSession` has a token as one of its fields, which is comparable to a pin code to provide quick access to the session where the data needs to be stored. 
* `Scale`: a scale on which a score, or a KPI (Key Performance Indicator) is stored, e.g., 0-100 %; 0-5 stars; A through F, 1 to 10, the number of seconds it took to complete a mission on the interval (0, 3600], etc. 
* `PlayerObjective`: a personal KPI for a `GameMission` with a threshold. Every `PlayerObjective` is lined to a `Scale`. The threshold can, e.g., be 80% on a percent scale between 0 and 100. Another player KPI for a mission can state that the assignment should be finished within 30 seconds, where the scale is the number of seconds to complete.
* `GroupObjective`: a group KPI for a `GameMission` with a threshold. Every `GroupObjective` is lined to a `Scale`. The threshold can, e.g., be a 'B' on an A-F scale where A is the highest, and F is the lowest. Another group KPI for a mission can state that the group mark on a 1-10 scale should be 6 or higher to pass.

The dynamic game data that is offered from the `Game` to the game data server through the `gamedata-server` application:

* `Player`: An identifiable single player working with the game. For players, scores, actions and events can be stored.
* `Group`: An identifiable group of players working with the game. Also for groups, scores, actions and events can be stored.
* `GroupRole`: The role that the player serves in the group to which they belong. All players can be, e.g., 'Member'. It can also be that one player is the 'CEO', a second player in the group the 'CFO' and a third player the 'COO'. 
* `PlayerAttempt`: A `Player` can potentially redo a `GameMission` multiple times. When this happens, the data for the different times that a player repeats the `GameMission` is stored under different `PlayerAttempt` records. The attempts are numbered sequentially, starting with '1'.



All stored data is linked to a `GameSession`, a `GameMission` and a `Player` and/or `Group`. The `GameSession` and `GameMission` uniquely define the `GameVersion`, the `Game` and the `Organization` that is playing the `Game`. 
