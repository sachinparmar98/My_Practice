window.eventMetricsCollector = {
    onEvent: 'onEvent',
    onInit: 'onInit',
    contentLoaded: window.performance.timing.domContentLoadedEventEnd,
    onCollect: function (app, event) {
        if (event !== this.onInit && event !== this.onEvent) return;
        if (this[app] && this[app][event]) return;

        var scripts = document.getElementsByTagName('script');
        scripts = Array.prototype.slice.call(scripts);
        var src = '';

        for (var i = 0; i < scripts.length; i++) {
            if (scripts[i].src.indexOf('funnel/timing') !== -1) {
                src += scripts[i].src;
                break;
            }
        }

        var host = src.match(/https?:\/\/[^\/]*/)[0];
        var url = host + '/funnel/timing.php';

        this[app] = this[app] || {};

        this[app][event] = window.performance.now();

        if (event === this.onEvent) {
            var data = {
                app: app,
                onEvent: this[app].onEvent - this.contentLoaded,
            };

            if (this[app].onInit) {
                data.onInit = this[app].onInit - this.contentLoaded;
            }

            if (app === 'editor') {
                var cookieFunnel = this.getCookie('funnel_timing');
                if (cookieFunnel) {
                    data.time = this.getTime() - cookieFunnel;
                    this.removeCookie('funnel_timing');
                }
            } else if (app !== 'payment') {
                this.setCookie('funnel_timing', this.getTime(), 3);
            }

            var xhr = new XMLHttpRequest();
            xhr.open('POST', url, true);
            xhr.send(JSON.stringify(data));
        }
    },

    getUrl: function() {
        var scripts = document.getElementsByTagName('script');
        scripts = Array.prototype.slice.call(scripts);
        var src = '';

        for (var i = 0; i <= scripts.length; i++) {
            if (scripts[i].src.indexOf('funnel/timing') !== -1) {
                src += scripts[i].src;
                break;
            }
        }

        var host = src.match(/https?:\/\/[^\/]*/)[0];
        var url = host + '/funnel/timing.php';
        return url;
    },

    onLoad: function (app) {
        if ("performance" in window && "timing" in window.performance) {
            var domContentLoaded = window.performance.timing.domContentLoadedEventEnd - window.performance.timing.navigationStart;
            var domComplete = window.performance.timing.domComplete - window.performance.timing.navigationStart;
            var data = {
                app: app,
                type: 'load',
                onLoad: domComplete
            };

            var xhr = new XMLHttpRequest();
            xhr.open('POST', this.getUrl(), true);
            xhr.send(JSON.stringify(data));
        }
    },

    setCookie: function (cookie_name, value, exdays) {
        var exdate = new Date();
        exdate.setDate(exdate.getDate() + exdays);
        var c_value = escape(value) + ((exdays == null) ? "" : "; expires=" + exdate.toUTCString()) + '; path=/;';
        document.cookie = cookie_name + "=" + c_value;
    },

    getCookie: function (cookie_name) {
        var results = document.cookie.match('(^|;) ?' + cookie_name + '=([^;]*)(;|$)');

        if (results) {
            return unescape(results[2]);
        } else {
            return null;
        }
    },

    removeCookie: function(cookie_name) {
        this.setCookie(cookie_name, 0, -100);
    },

    getTime: function () {
        return (new Date()).getTime();
    }
};