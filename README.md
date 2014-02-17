# LiveAttack
### A plugin for [Darklight Nova Core](https://github.com/darklight-studios/darklight-nova-core)

### Function
LiveAttack allows the creation of Triggers, similar to the Issues built into DNC, however Triggers, when activated, deduct from the point total of a session.

### Use
When building a DNC session:

1. Download the Triggers you want to use (or write your own)
2. Clone this repo, compile into a jar
3. Import LiveAttack (and the Triggers you downloaded) into the CoreEngine.java file from DNC
4. Create a new LiveAttackAccessHandler object (after the issues array is initalized, because it is one of the arguments for the constructor)
5. Create a new LiveAttack object and pass the LiveAttackAccessHandler object to the constructor
6. Call `LiveAttack.setTriggers` with the parameter being an array of the Triggers you are using, all initalized
7. Add the LiveAttack object to the plugin array that is sent to the DNC PluginHandler
8. Good luck.

**Note:** The triggers are injected into the issue list, and a new IssueHandler object is created (don't worry about it). The point is: Triggers will show up on the score report **if they are not triggered**. Triggers will **not** show up on the score report if they **are** triggered.


### License
[GPLv3](https://github.com/darklight-studios/UserInterface/blob/master/LICENSE)