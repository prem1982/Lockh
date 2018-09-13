# These configuration are necessary if you are using Bottle as your webserver
BottlePortNumber = 8080
BottleHostname = 'localhost'
PathToDataFiles = "../cookedData"
URLToPPSearchApiSolr = "https://10.172.0.10/apisolr"
#URLToPPSearchApiSolr = "https://10.172.0.240/apisolr"
URLToSolr = 'http://localhost:8983/solr'
CAS_GROUP_AGY_GSA_FAS_PRICESPAID_REQUIRED = 'T'
CAS_GROUP = 'AGY-GSA-FAS.PRICESPAID'
#Sprint-4 changes
CAS_USER_CLASSIFICATION = 'FEDERAL'
LocalURLToRecordFeedback = '/gui/record_feedback'

# If you want google analytics, put it here, if not, use an empty script
GoogleAnalyticsInclusionScript = """   <script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-48986383-1', 'acquisition.gov',{'cookieDomain':'none'});
  ga('send', 'pageview');

</script>"""

RelativePathToHashesFile = "../configuration/p3api.hashes.txt"

# I'm going to use a 10-minute timeout
#TokenTimeout = 600*2
TokenTimeout = 20000

LIMIT_NUMBER_BAD_LOGINS = 5

# We'll make them wait one hour if they have 5 bad logins.
LIMIT_TIME_TO_RETRY = 60*60

GITHUB_APPLICATION__PUBLIC_KEY = 'R8uvWsUFvbGR6dKowJMHo4ozcnM'

# it would be better to use boolean, but these are interpreted 
# directly in templates, and so it easier to use strings
GITHUB_DISPLAY_VALUE = 'F'
MYUSA_DISPLAY_VALUE = 'F'
MAX_DISPLAY_VALUE = 'T'
BASIC_DISPLAY_VALUE = 'T'

# CAS_SERVER = 'http://127.0.0.1:8099'
CAS_SERVER = 'https://login.max.gov'
# CAS_RETURN_SERVICE_URL = 'http://127.0.0.1/apisolr/ReturnLoginViaMax'
CAS_RETURN_SERVICE_URL = 'https://p3-dev.fas.gsa.gov/gui/ReturnLoginViaMax'
CAS_CREATE_SESSION_IF_AUTHENTICATED = 'https://p3-dev.fas.gsa.gov/apisolr/ReturnSessionViaMax'
#CAS_RETURN_SERVICE_URL = 'https://54.164.31.174/gui/ReturnLoginViaMax'
#CAS_CREATE_SESSION_IF_AUTHENTICATED = 'https://54.164.31.174/apisolr/ReturnSessionViaMax'


# This should be in the form of a python "requests" proxies dictionary
# CAS_SERVER_PROXY =  {
#  "http": "http://10.10.1.10:3128",
#   "https": "http://10.10.1.10:1080",
# }
 
CAS_PROXY =  {
#   "https": "ftp-proxy.fss.gsa.gov:3128",
}

CAS_LEVEL_OF_ASSURANCE = "assurancelevel3"
CAS_LEVEL_OF_ASSURANCE_PREDICATE_LOA3 = lambda loa,piv: {
    ("http://idmanagement.gov/icam/2009/12/saml_2.0_profile/assurancelevel3" == loa)
}
CAS_LEVEL_OF_ASSURANCE_PREDICATE_LOA2 = lambda loa,piv: {
    ("http://idmanagement.gov/icam/2009/12/saml_2.0_profile/assurancelevel2" == loa)
    or 
    ("http://idmanagement.gov/icam/2009/12/saml_2.0_profile/assurancelevel3" == loa)

}

CAS_LEVEL_OF_ASSURANCE_PREDICATE_LOA2_AND_PIV = lambda loa,piv: {
    (("http://idmanagement.gov/icam/2009/12/saml_2.0_profile/assurancelevel2" == loa)
    or
    ("http://idmanagement.gov/icam/2009/12/saml_2.0_profile/assurancelevel3" == loa))
    and
    ("urn:max:fips-201-pivcard" == piv)

}
CAS_PIV_CARD = lambda loa,piv: {
   ("urn:max:fips-201-pivcard" == piv)
}
CAS_PASSWORD_OR_PIV = lambda loa, piv: {
   ("urn:max:fips-201-pivcard" == piv)
   or
   ("urn:oasis:names:tc:SAML:1.0:am:password" == piv)
}

CAS_LEVEL_3 = lambda loa, piv: {
   ("urn:max:am:secureplus:federated-saml2:assurancelevel3" == piv)
}

CAS_PIV_OR_LEVEL_3 = lambda loa, piv: {
   ("urn:max:fips-201-pivcard" == piv)
   or
   ("urn:max:am:secureplus:federated-saml2:assurancelevel3" == piv)
}

CAS_LEVEL_OF_ASSURANCE_PREDICATE = CAS_PASSWORD_OR_PIV
#CAS_LEVEL_OF_ASSURANCE_PREDICATE = CAS_PASSWORD_OR_PIV


