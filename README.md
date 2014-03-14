<<<<<<< HEAD
# Active development has stopped

RestClient has been mostly absorbed and reborn in the [twotoasters/hoot]("https://github.com/twotoasters/hoot") library. Since many of my own projects still use RestClient, I'll fix bugs as necessary, but I'll use hoot for new development.

# Running Tests

These instructions are for running the tests in Eclipse. There's no need to run a device or emulator.

1. Install [Robolectric](http://pivotal.github.com/robolectric/).

1. Import these three RestClient projects into Eclipse. Refer to the Robolectric install instructions to fix up any project dependency issues that occur.

  * The RestClient SDK library project in the top level folder.
  * The RestClientExampleApp project in the example-app folder.
  * The RestClientTest project in the example-app/test-app folder.

1. The tests use Sinatra as a local test server.

    gem install sinatra json
    
1. Start the test server by cd'ing to example-app/test-app/sinatra folder and run

    ruby robolectric.rb

1. In Eclipse, select the RestClientTest project and "Run As" => "JUnit Test"



  

=======
# RESTClient

[RESTClient](http://restclient.net) is a debugger for RESTful web services. Currently only [Firefox addon](https://addons.mozilla.org/en-US/firefox/addon/9780/) has been finished.

## Changes


### Firefox Addon

* Version 2.0.3
  * Supported OAuth2 authentication
  * Fixed url history bug
  * Show HTTP request execution time
  
* Version 2.0.2
  * Fixed links in the returned xml - they are now clickable again
  * Added OAuth Realm support
  * Allow user to switch page layout (by precentage/fixed)
  * Allow user to view request headers in table or as tags
  * Added a remove all headers button
  * Fixed request URL input box size bug
  * Fixed OAuth query string bug
  * Fixed OAuth whitespace ending bug

* Version 2.0.1
  * Fixed XML result indentation
  * Remember open response tab
  * Fixed request url input box size bug
  * Support Firefox 12
  * Allow user to load old requests (exported by version 1.3.x)
  * Updated favorite url, add a drop down list for showing favorite URLs
  * Updated UI color, to enhance the request form

* Version 2.0.0
  * Re-designed the UI by using [twitter bootstrap](twitter.github.com/bootstrap/)
  * Bind hotkeys to send request, input url, etc.
  * Fixed multiple set-cookie response bug  (isseue #26)
  * Allow to copy response headers
  * Added theme support
>>>>>>> upstream/master
