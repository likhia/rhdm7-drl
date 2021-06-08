* Set the ksession name as default-stateless-ksession under the kbase in project -> setting. 

* Set the body of input parameter as below

```
{
"lookup" : "default-stateless-ksession",
"commands":[
  {
    "insert":{
      "object":{
        "com.myspace.demo_project.LoanRequest":{
          "loanAmount": 15000,
          "creditLevel": 8
        }
      },
      "out-identifier":"request"
    }
  },
  {
    "insert": {
        "object": {
          "com.myspace.demo_project.LoanOutcome": {}
        },
        "return-object": true,
        "out-identifier": "result"
      }
  },
  {
    "fire-all-rules": {
        "out-identifier": "firedActivations"
      }
  }
]
}
```