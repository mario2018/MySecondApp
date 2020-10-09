Feature: Vote function

  Everyone can only take specific limited votes in each round

  Scenario Outline: Everyone can only take specific limited votes in each round
    Given <recipientNumber> participants, everyone votes <voteTimes>
    When participants finish voting
    Then total votes should be <totalVotes>

    @normal
    Examples:
      | recipientNumber | voteTimes | totalVotes |
      | 2               | 1         | 2          |
      | 3               | 2         | 6          |

    @exception
    Examples:
      | recipientNumber | voteTimes | totalVotes |
      | 4               | 2         | 4          |