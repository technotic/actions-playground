# actions-playground
A playground for github actions.

Generated docs are [here](https://technotic.github.io/actions-playground/)

The end goal is to generate something like the following based on:
* Github commit history and tags
  * What release versions are there, what commits => changes done grouped by story, by whom, when
* Rally
  * What were the related stories and features - links to these
* Jenkins
  * When was it built - link to release build

How to get:
* checkmark link - from jenkins output?
* sonar link - from jenkins output?
* test reports - from jenkins output?
* CR - needs to be added manually?
* link to artifact

Can we include this in the release tag?

---

# application-name

## Current

### 5.8.4

* Build: 01/02/2022 10:00 (*[#105]()*)
* Links:
  [github](http://www.somewhere.com),
  [checkmarx](http://www.somewhere.com),
  [sonar](http://www.somewhere.com),
  [test reports](http://www.somewhere.com),
  [CR](http://www.somewhere.com),
  [artifact](http://www.somewhere.com)

since 5.8.0

| Feature | Story    | Details                 |
----------|----------|-------------------------|
| [F108100](http://rally1.reallydev.com) | [US100001](http://rally1.reallydev.com) | This did something.     |
|         | US100002 | This did something else |
|         | US100002 | This did something else |
| F108101 | US100003 | This did something      |

Deployed

| Env  | When                 |
|------|----------------------|
| DEV  | [01/01/2022 12:00]() | 
| TEST | [03/01/2022 12:00]() | 
| UAT  | [07/01/2022 12:00]() | 
| PPE  | [11/01/2022 12:00]() | 
| PROD |                      |

### 5.8.3

* Build: 01/01/2022 11:23 (*[#104]()*)
* Links:
[checkmarx](http://www.somewhere.com),
[sonar](http://www.somewhere.com),
[test reports](http://www.somewhere.com),
[CR](http://www.somewhere.com),
[artifact](http://www.somewhere.com)

since 5.8.0

| Feature | Story    | Details                 |
----------|----------|-------------------------|
| F108100 | US100001 | This did something      |
|         | US100002 | This did something else |
|         | US100002 | This did something else |

## Released

### 5.8.0
prod: 01/01/2022 17:15

| Feature | Story    | Details                 |
----------|----------|-------------------------|
| F108100 | US100001 | This did something.     |
|         | US100002 | This did something else |
|         | US100002 | This did something else |
| F108101 | US100003 | This did something      |

* Links:
  [github](http://www.somewhere.com),
  [checkmarx](http://www.somewhere.com),
  [sonar](http://www.somewhere.com),
  [test reports](http://www.somewhere.com),
  [CR](http://www.somewhere.com),
  [artifact](http://www.somewhere.com)

### 5.7.5
prod: 01/03/2022 13:15

| Feature | Story    | Details                 |
----------|----------|-------------------------|
| F108100 | US100001 | This did something.     |
|         | US100002 | This did something else |
|         | US100002 | This did something else |
| F108101 | US100003 | This did something      |

* Links:
  [github](http://www.somewhere.com),
  [checkmarx](http://www.somewhere.com),
  [sonar](http://www.somewhere.com),
  [test reports](http://www.somewhere.com),
  [CR](http://www.somewhere.com),
  [artifact](http://www.somewhere.com)
