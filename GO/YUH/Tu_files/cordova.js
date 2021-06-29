// web app version of the cordova object.
// cordova.js is loaded by our hybrids after they pull a platform dependent version from
// their local bundles.
window.cordova = {
    platformId : "web",

    exec : function() {
        // no op
    }
};

