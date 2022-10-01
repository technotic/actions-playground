* Get current release number and previous release number
* Use Github API to get all commits between current and previous release
* Write info to release-x.x.x.json file
    * Story number
    * Who made the commit (> 1?)
    * When

Ideas:
* Generate MD into the doc folder?
* Have one repo that handles all other repos
  * How to trigger? Have a callback from each repo when release created? see repository-dispatch

```json
[
  {
    "source": "github",
    "data": {
      "tag": "3.8.5",
      "previous-tag": "3.8.4",
      "hash": "xxx",
      "when": "2022-01-01 10:00",
      "commits": [
        {
          "id": "US1001001",
          "who": "User1",
          "when": "2022-01-01 10:00"
        }
      ]
    }
  },
  {
    "source": "rally",
    "data": {
      "stories": [
        {
          "id": "US1001001",
          "featureId": "F1001",
          "name": "A nice story",
          "owner": "Fred"
        }
      ],
      "features": [
        {
          "id": "F1001",
          "name": "A nice feature",
          "owner": "Jane"
        }
      ]
    }
  },
  {
    "source": "jenkins",
    "data": {
      "build": {
        "id": 101,
        "when": "2022-01-01 10:00",
        "who": "xxx",
        "checkmarx": "xxx",
        "sonar": "xxx"
      }
    }
  }
]
```