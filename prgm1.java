<!DOCTYPE html>
<!-- saved from url=(0061)https://www.hackerrank.com/challenges/welcome-to-java/problem -->
<html lang="en-us" style="--font-family-text:OpenSans, Arial, Helvetica, sans-serif; --font-family-input:SourceCodePro, monaco, Courier, monospace;" class=""><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><style id="react-tooltip">.__react_component_tooltip{border-radius:3px;display:inline-block;font-size:13px;left:-999em;opacity:0;padding:8px 21px;position:fixed;pointer-events:none;transition:opacity 0.3s ease-out;top:-999em;visibility:hidden;z-index:999}.__react_component_tooltip.allow_hover{pointer-events:auto}.__react_component_tooltip:before,.__react_component_tooltip:after{content:"";width:0;height:0;position:absolute}.__react_component_tooltip.show{opacity:0.9;margin-top:0px;margin-left:0px;visibility:visible}.__react_component_tooltip.type-dark{color:#fff;background-color:#222}.__react_component_tooltip.type-dark.place-top:after{border-top-color:#222;border-top-style:solid;border-top-width:6px}.__react_component_tooltip.type-dark.place-bottom:after{border-bottom-color:#222;border-bottom-style:solid;border-bottom-width:6px}.__react_component_tooltip.type-dark.place-left:after{border-left-color:#222;border-left-style:solid;border-left-width:6px}.__react_component_tooltip.type-dark.place-right:after{border-right-color:#222;border-right-style:solid;border-right-width:6px}.__react_component_tooltip.type-dark.border{border:1px solid #fff}.__react_component_tooltip.type-dark.border.place-top:before{border-top:8px solid #fff}.__react_component_tooltip.type-dark.border.place-bottom:before{border-bottom:8px solid #fff}.__react_component_tooltip.type-dark.border.place-left:before{border-left:8px solid #fff}.__react_component_tooltip.type-dark.border.place-right:before{border-right:8px solid #fff}.__react_component_tooltip.type-success{color:#fff;background-color:#8DC572}.__react_component_tooltip.type-success.place-top:after{border-top-color:#8DC572;border-top-style:solid;border-top-width:6px}.__react_component_tooltip.type-success.place-bottom:after{border-bottom-color:#8DC572;border-bottom-style:solid;border-bottom-width:6px}.__react_component_tooltip.type-success.place-left:after{border-left-color:#8DC572;border-left-style:solid;border-left-width:6px}.__react_component_tooltip.type-success.place-right:after{border-right-color:#8DC572;border-right-style:solid;border-right-width:6px}.__react_component_tooltip.type-success.border{border:1px solid #fff}.__react_component_tooltip.type-success.border.place-top:before{border-top:8px solid #fff}.__react_component_tooltip.type-success.border.place-bottom:before{border-bottom:8px solid #fff}.__react_component_tooltip.type-success.border.place-left:before{border-left:8px solid #fff}.__react_component_tooltip.type-success.border.place-right:before{border-right:8px solid #fff}.__react_component_tooltip.type-warning{color:#fff;background-color:#F0AD4E}.__react_component_tooltip.type-warning.place-top:after{border-top-color:#F0AD4E;border-top-style:solid;border-top-width:6px}.__react_component_tooltip.type-warning.place-bottom:after{border-bottom-color:#F0AD4E;border-bottom-style:solid;border-bottom-width:6px}.__react_component_tooltip.type-warning.place-left:after{border-left-color:#F0AD4E;border-left-style:solid;border-left-width:6px}.__react_component_tooltip.type-warning.place-right:after{border-right-color:#F0AD4E;border-right-style:solid;border-right-width:6px}.__react_component_tooltip.type-warning.border{border:1px solid #fff}.__react_component_tooltip.type-warning.border.place-top:before{border-top:8px solid #fff}.__react_component_tooltip.type-warning.border.place-bottom:before{border-bottom:8px solid #fff}.__react_component_tooltip.type-warning.border.place-left:before{border-left:8px solid #fff}.__react_component_tooltip.type-warning.border.place-right:before{border-right:8px solid #fff}.__react_component_tooltip.type-error{color:#fff;background-color:#BE6464}.__react_component_tooltip.type-error.place-top:after{border-top-color:#BE6464;border-top-style:solid;border-top-width:6px}.__react_component_tooltip.type-error.place-bottom:after{border-bottom-color:#BE6464;border-bottom-style:solid;border-bottom-width:6px}.__react_component_tooltip.type-error.place-left:after{border-left-color:#BE6464;border-left-style:solid;border-left-width:6px}.__react_component_tooltip.type-error.place-right:after{border-right-color:#BE6464;border-right-style:solid;border-right-width:6px}.__react_component_tooltip.type-error.border{border:1px solid #fff}.__react_component_tooltip.type-error.border.place-top:before{border-top:8px solid #fff}.__react_component_tooltip.type-error.border.place-bottom:before{border-bottom:8px solid #fff}.__react_component_tooltip.type-error.border.place-left:before{border-left:8px solid #fff}.__react_component_tooltip.type-error.border.place-right:before{border-right:8px solid #fff}.__react_component_tooltip.type-info{color:#fff;background-color:#337AB7}.__react_component_tooltip.type-info.place-top:after{border-top-color:#337AB7;border-top-style:solid;border-top-width:6px}.__react_component_tooltip.type-info.place-bottom:after{border-bottom-color:#337AB7;border-bottom-style:solid;border-bottom-width:6px}.__react_component_tooltip.type-info.place-left:after{border-left-color:#337AB7;border-left-style:solid;border-left-width:6px}.__react_component_tooltip.type-info.place-right:after{border-right-color:#337AB7;border-right-style:solid;border-right-width:6px}.__react_component_tooltip.type-info.border{border:1px solid #fff}.__react_component_tooltip.type-info.border.place-top:before{border-top:8px solid #fff}.__react_component_tooltip.type-info.border.place-bottom:before{border-bottom:8px solid #fff}.__react_component_tooltip.type-info.border.place-left:before{border-left:8px solid #fff}.__react_component_tooltip.type-info.border.place-right:before{border-right:8px solid #fff}.__react_component_tooltip.type-light{color:#222;background-color:#fff}.__react_component_tooltip.type-light.place-top:after{border-top-color:#fff;border-top-style:solid;border-top-width:6px}.__react_component_tooltip.type-light.place-bottom:after{border-bottom-color:#fff;border-bottom-style:solid;border-bottom-width:6px}.__react_component_tooltip.type-light.place-left:after{border-left-color:#fff;border-left-style:solid;border-left-width:6px}.__react_component_tooltip.type-light.place-right:after{border-right-color:#fff;border-right-style:solid;border-right-width:6px}.__react_component_tooltip.type-light.border{border:1px solid #222}.__react_component_tooltip.type-light.border.place-top:before{border-top:8px solid #222}.__react_component_tooltip.type-light.border.place-bottom:before{border-bottom:8px solid #222}.__react_component_tooltip.type-light.border.place-left:before{border-left:8px solid #222}.__react_component_tooltip.type-light.border.place-right:before{border-right:8px solid #222}.__react_component_tooltip.place-top{margin-top:-10px}.__react_component_tooltip.place-top:before{border-left:10px solid transparent;border-right:10px solid transparent;bottom:-8px;left:50%;margin-left:-10px}.__react_component_tooltip.place-top:after{border-left:8px solid transparent;border-right:8px solid transparent;bottom:-6px;left:50%;margin-left:-8px}.__react_component_tooltip.place-bottom{margin-top:10px}.__react_component_tooltip.place-bottom:before{border-left:10px solid transparent;border-right:10px solid transparent;top:-8px;left:50%;margin-left:-10px}.__react_component_tooltip.place-bottom:after{border-left:8px solid transparent;border-right:8px solid transparent;top:-6px;left:50%;margin-left:-8px}.__react_component_tooltip.place-left{margin-left:-10px}.__react_component_tooltip.place-left:before{border-top:6px solid transparent;border-bottom:6px solid transparent;right:-8px;top:50%;margin-top:-5px}.__react_component_tooltip.place-left:after{border-top:5px solid transparent;border-bottom:5px solid transparent;right:-6px;top:50%;margin-top:-4px}.__react_component_tooltip.place-right{margin-left:10px}.__react_component_tooltip.place-right:before{border-top:6px solid transparent;border-bottom:6px solid transparent;left:-8px;top:50%;margin-top:-5px}.__react_component_tooltip.place-right:after{border-top:5px solid transparent;border-bottom:5px solid transparent;left:-6px;top:50%;margin-top:-4px}.__react_component_tooltip .multi-line{display:block;padding:2px 0px;text-align:center}</style>
  
  
  <meta property="og:image" id="meta-og-image" content="https://hrcdn.net/og/default.jpg"><meta property="og:site_name" id="meta-og-site" content="HackerRank"><meta property="og:type" id="meta-og-type" content="website"><meta property="article:author" content="https://www.facebook.com/hackerrank"><meta name="twitter:card" id="meta-twitter-card" content="summary"><meta name="twitter:site" id="meta-twitter-site" content="@hackerrank"><meta property="fb:app_id" id="meta-fb-id" content="347499128655783"><meta name="theme-color" content="rgb(57, 66, 78)"><meta content="authenticity_token" name="csrf-param" id="csrf-param"><meta content="N0FUMyVnSer2TV+6wuYrENAg2j9mVD9+ID8shS6fgFtEZP7eQnT+UabClpeo11sd9rHdz/CUlFOJfj2gluG9vA==" name="csrf-token" id="csrf-token">
  <script type="text/javascript" async="" src="./prgm1_files/analytics.js.download"></script><script type="text/javascript" async="" src="./prgm1_files/gtm.js.download"></script><script type="text/javascript" async="" src="./prgm1_files/analytics.js.download"></script><script async="" src="./prgm1_files/pendo.js.download"></script><script async="" src="./prgm1_files/gtm.js(1).download"></script><script>/*!
 * JavaScript Cookie v2.1.3
 * https://github.com/js-cookie/js-cookie
 *
 * Copyright 2006, 2015 Klaus Hartl & Fagner Brack
 * Released under the MIT license
 */
;(function (factory) {
	var registeredInModuleLoader = false;
	if (typeof define === 'function' && define.amd) {
		define(factory);
		registeredInModuleLoader = true;
	}
	if (typeof exports === 'object') {
		module.exports = factory();
		registeredInModuleLoader = true;
	}
	if (!registeredInModuleLoader) {
		var OldCookies = window.Cookies;
		var api = window.Cookies = factory();
		api.noConflict = function () {
			window.Cookies = OldCookies;
			return api;
		};
	}
}(function () {
	function extend () {
		var i = 0;
		var result = {};
		for (; i < arguments.length; i++) {
			var attributes = arguments[ i ];
			for (var key in attributes) {
				result[key] = attributes[key];
			}
		}
		return result;
	}

	function init (converter) {
		function api (key, value, attributes) {
			var result;
			if (typeof document === 'undefined') {
				return;
			}

			// Write

			if (arguments.length > 1) {
				attributes = extend({
					path: '/'
				}, api.defaults, attributes);

				if (typeof attributes.expires === 'number') {
					var expires = new Date();
					expires.setMilliseconds(expires.getMilliseconds() + attributes.expires * 864e+5);
					attributes.expires = expires;
				}

				try {
					result = JSON.stringify(value);
					if (/^[\{\[]/.test(result)) {
						value = result;
					}
				} catch (e) {}

				if (!converter.write) {
					value = encodeURIComponent(String(value))
						.replace(/%(23|24|26|2B|3A|3C|3E|3D|2F|3F|40|5B|5D|5E|60|7B|7D|7C)/g, decodeURIComponent);
				} else {
					value = converter.write(value, key);
				}

				key = encodeURIComponent(String(key));
				key = key.replace(/%(23|24|26|2B|5E|60|7C)/g, decodeURIComponent);
				key = key.replace(/[\(\)]/g, escape);

				return (document.cookie = [
					key, '=', value,
					attributes.expires ? '; expires=' + attributes.expires.toUTCString() : '', // use expires attribute, max-age is not supported by IE
					attributes.path ? '; path=' + attributes.path : '',
					attributes.domain ? '; domain=' + attributes.domain : '',
					attributes.secure ? '; secure' : ''
				].join(''));
			}

			// Read

			if (!key) {
				result = {};
			}

			// To prevent the for loop in the first place assign an empty array
			// in case there are no cookies at all. Also prevents odd result when
			// calling "get()"
			var cookies = document.cookie ? document.cookie.split('; ') : [];
			var rdecode = /(%[0-9A-Z]{2})+/g;
			var i = 0;

			for (; i < cookies.length; i++) {
				var parts = cookies[i].split('=');
				var cookie = parts.slice(1).join('=');

				if (cookie.charAt(0) === '"') {
					cookie = cookie.slice(1, -1);
				}

				try {
					var name = parts[0].replace(rdecode, decodeURIComponent);
					cookie = converter.read ?
						converter.read(cookie, name) : converter(cookie, name) ||
						cookie.replace(rdecode, decodeURIComponent);

					if (this.json) {
						try {
							cookie = JSON.parse(cookie);
						} catch (e) {}
					}

					if (key === name) {
						result = cookie;
						break;
					}

					if (!key) {
						result[name] = cookie;
					}
				} catch (e) {}
			}

			return result;
		}

		api.set = api;
		api.get = function (key) {
			return api.call(api, key);
		};
		api.getJSON = function () {
			return api.apply({
				json: true
			}, [].slice.call(arguments));
		};
		api.defaults = {};

		api.remove = function (key, attributes) {
			api(key, '', extend(attributes, {
				expires: -1
			}));
		};

		api.withConverter = init;

		return api;
	}

	return init(function () {});
}));
</script>
  <script>
    window.BACKEND_ENDPOINT = 'https://www.hackerrank.com/';
    window.MANIFEST_VERSION = '59f7a32c8a';
  </script>

  

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="icon" type="image/png" href="https://hrcdn.net/fcore/assets/favicon-62bdd46faf.png">

  <!-- Prefetch dns on production -->
  
    <link rel="dns-prefetch" href="https://hrcdn.net/">
    <link rel="dns-prefetch" href="https://d3keuzeb2crhkn.cloudfront.net/">
    <link rel="dns-prefetch" href="https://notifications.hackerrank.com/">
    <link rel="dns-prefetch" href="https://metrics.hackerrank.com/">
    <link rel="preconnect" href="https://sentry.io/">
    <link rel="dns-prefetch" href="https://sentry.io/">
  

  


  
    <link href="./prgm1_files/hackerrank_r_old_trimmed-eb34f119.css" media="all" rel="stylesheet"><link rel="stylesheet" href="./prgm1_files/hackerrank_r_old_trimmed-eb34f119.css">
  

  
    <link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_vendors_community_sourcing_company-cdf7e119.css">
  
    <link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_vendors_community-3ba77b97.css">
  
    <link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_modules_community_testsettings_library_sso_settings_sourcing_company_jobs_sourcing_applications_sourcing_company-765bee6d.css">
  
    <link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_modules_community_testoverview_sourcing_company-cdf46239.css">
  
    <link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_modules_community_work_login_work-4fc9dc3c.css">
  
    <link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_modules_community_work_iframeable_pricing_container-934532a4.css">
  
    <link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_modules_custominput_community_sourcing_company-6ae8322d.css">
  
    <link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_modules_community_sourcing_applications-4293c3dd.css">
  
    <link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_modules_community_sourcing_company-4314a497.css">
  
    <link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_modules_community_work-72c625c8.css">
  
    <link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_modules_community-213b83a2.css">
  
    <link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_community-b21841fb.css">
  
    <link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_vendors_app-8a5aefaa.css">
  
    <link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_modules_app-5a2f721e.css">
  
    <link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_app-37884480.css">
  
    <link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_modules_challenge_list_challenge_list_v2_challenge_jobs_profile_v2_interview_singletest_library_teams-106fc6fb.css">
  
    <link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_modules_challenge_list_challenge_list_v2_challenge_interview-b52bd2f0.css">
  
    <link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_commons_challenge_list_challenge_list_v2_challenge_onboarding_profile_v2_interview-3142e06f.css">
  
    <link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_commons_challenge_list_challenge_list_v2_challenge_interview-816759ba.css">
  
    <link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_commons_challenge_list_challenge_list_v2_interview-abe1b6e7.css">
  
    <link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_challenge_list-9b8768a7.css">
  

  <!-- Prefetch / preload assets on production -->
  

    <!-- preload scripts required on the same page -->
    <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_vendor-5a221bff30.js.download">
    <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_client-0c639c43a6.js.download">
    <link rel="preload" as="script" href="./prgm1_files/runtime-8c52599ae7.js.download">

    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_modules_community_testsettings_library_sso_settings_sourcing_company_jobs_sourcing_applications_sourcing_company-d0ce118fbc.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_vendors_community_singletest_testquestions_library_company_profile_settings_sourcing_company-b09792b1d9.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_vendors_custominput_community_testquestions_testsettings_sourcing_company-bc51d918e7.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_modules_work_community_work_login_iframeable_pricing_container-9d0f260378.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_modules_community_testoverview_sourcing_company-14eead5cf6.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_modules_community_work_login_work-a1b31ded39.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_modules_community_work_iframeable_pricing_container-d567873c43.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_modules_custominput_community_sourcing_company-e30a566156.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_vendors_community_work_iframeable_pricing_container-77dc68a544.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_vendors_custominput_community_sourcing_company-3931fef6a2.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_vendors_custominput_community_work-5478653f28.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_modules_community_sourcing_applications-ab45685c2d.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_modules_community_sourcing_company-421e0655e3.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_modules_community_work-819726c2bf.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_vendors_community_library-8fd53eb3bd.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_vendors_community_sourcing_company-0f41697555.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_vendors_community_work-ab9d7cbec0.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_community-9d33075e24.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_modules_community-c91140404b.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_vendors_community-249d40a790.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_vendors_app_lsp_client-9cdbd43e1d.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_app-5f37e7bb3a.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_modules_app-97fb5f0e06.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_vendors_app-7b426b7e2f.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_modules_challenge_list_challenge_list_v2_challenge_jobs_profile_v2_interview_singletest_library_teams-fe1fb30cfd.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_vendors_work_challenge_list_challenge_list_v2_challenge_jobs_calendar_onboarding_scoring_interview-a1056a3145.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_commons_challenge_list_challenge_list_v2_challenge_onboarding_profile_v2_interview-8ea038a254.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_modules_challenge_list_challenge_list_v2_challenge_onboarding_profile_v2_interview-3de4e57f37.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_vendors_challenge_list_challenge_list_v2_jobs_scoring_interview-2103a30f32.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_commons_challenge_list_challenge_list_v2_challenge_interview-8f83157c49.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_modules_challenge_list_challenge_list_v2_challenge_interview-268b72dbe6.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_commons_challenge_list_challenge_list_v2_interview-ca86b08a75.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_modules_challenge_list_challenge_list_v2_interview-96bcfca26d.js.download">
    
      <link rel="preload" as="script" href="./prgm1_files/hackerrank_r_challenge_list-7a4def2f99.js.download">
    
    <!-- preload scripts end -->

    <!-- Prefetch old css files -->
    <link rel="prefetch" href="https://hrcdn.net/fcore/assets/backbone_styles/hackerrank-core-b09922f4c9.css">
    <link rel="prefetch" href="https://hrcdn.net/fcore/assets/backbone_styles/hackerrank_libraries-6d1eda62f2.css">

    
      <link rel="prefetch" href="https://hrcdn.net/fcore/assets/backbone_styles/dashboard-173b5e46b8.css">
    
    <!-- Prefetch old css files end -->

  

  <!-- Load promise polyfill for the non-believers -->
  <script>
    window.Promise || document.write('<script src="https://hrcdn.net/fcore/assets/polyfill-d05a380d50.min.js" type="text\/javascript"><\/script>');
  </script>
  <!-- Added for GTM -->
  <!-- GTM setup -->

<script>
  dataLayer = [];
  window.jsTrackGoogleAnalytics = window.jsTrackGoogleAnalytics || function () {};
</script>

<!-- Google Tag Manager #1 -->
<script>(function(w,d,s,l,i){w[l]=w[l]||[];w[l].push({'gtm.start':
new Date().getTime(),event:'gtm.js'});var f=d.getElementsByTagName(s)[0],
j=d.createElement(s),dl=l!='dataLayer'?'&l='+l:'';j.async=true;j.src=
'https://www.googletagmanager.com/gtm.js?id='+i+dl;f.parentNode.insertBefore(j,f);
})(window,document,'script','dataLayer', 'GTM-NZTBQVZ');</script>
<!-- End Google Tag Manager 1 -->



<script charset="utf-8" src="./prgm1_files/hackerrank_r_modules_app-97fb5f0e06.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_vendors_app_lsp_client-9cdbd43e1d.js.download"></script><script charset="utf-8" src="./prgm1_files/custominput-58779e0aca.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_vendors_app-7b426b7e2f.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_app-5f37e7bb3a.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_modules_community_testsettings_library_sso_settings_sourcing_company_jobs_sourcing_applications_sourcing_company-d0ce118fbc.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_modules_work_community_work_login_iframeable_pricing_container-9d0f260378.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_modules_custominput_community_sourcing_company-e30a566156.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_modules_community_work_iframeable_pricing_container-d567873c43.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_modules_community_work_login_work-a1b31ded39.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_modules_community_testoverview_sourcing_company-14eead5cf6.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_modules_community_sourcing_company-421e0655e3.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_modules_community_work-819726c2bf.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_modules_community_sourcing_applications-ab45685c2d.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_modules_community-c91140404b.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_vendors_community_singletest_testquestions_library_company_profile_settings_sourcing_company-b09792b1d9.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_vendors_custominput_community_testquestions_testsettings_sourcing_company-bc51d918e7.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_vendors_community_work_iframeable_pricing_container-77dc68a544.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_vendors_custominput_community_sourcing_company-3931fef6a2.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_vendors_custominput_community_work-5478653f28.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_vendors_community_work-ab9d7cbec0.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_vendors_community_sourcing_company-0f41697555.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_vendors_community_library-8fd53eb3bd.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_vendors_community-249d40a790.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_community-9d33075e24.js.download"></script><link rel="prefetch" href="./prgm1_files/hackerrank_r_modules_challenge_list_challenge_list_v2_challenge_jobs_profile_v2_interview_singletest_library_teams-106fc6fb.css"><link rel="prefetch" href="./prgm1_files/hackerrank_r_modules_challenge_list_challenge_list_v2_challenge_interview-b52bd2f0.css"><link rel="prefetch" href="./prgm1_files/hackerrank_r_commons_challenge_list_challenge_list_v2_challenge_onboarding_profile_v2_interview-3142e06f.css"><link rel="prefetch" href="./prgm1_files/hackerrank_r_commons_challenge_list_challenge_list_v2_challenge_interview-816759ba.css"><link rel="prefetch" href="./prgm1_files/hackerrank_r_commons_challenge_list_challenge_list_v2_interview-abe1b6e7.css"><link rel="prefetch" href="./prgm1_files/hackerrank_r_challenge_list-9b8768a7.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_challenge_list_v2-81ca332820.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_forum-d0c957e9cb.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_vendors~forum~dashboard~profile_v2~library~advanced_settings~intersection_observer-b6089915fd.js"><link rel="prefetch" href="./prgm1_files/hackerrank_r_commons_contest_challenge_leaderboardv2_forum_leaderboard-25d1292083.js.download"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_modules~forum-e9cc3a530f.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_vendors~forum-1afe295d6d.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_modules~forum-44cf026d.css"><link rel="prefetch" href="./prgm1_files/hackerrank_r_commons_contest_challenge_leaderboardv2_forum_leaderboard-1db2de8d.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_forum-cca21234.css"><link rel="prefetch" href="./prgm1_files/hackerrank_r_challenge-de8d6bca0e.js.download"><link rel="prefetch" href="./prgm1_files/hackerrank_r_modules_work_iframeable_pricing_container_contest_challenge_leaderboardv2_leaderboard_scoring-d2c587e4c2.js.download"><link rel="prefetch" href="./prgm1_files/hackerrank_r_modules_work_contest_challenge_leaderboardv2_leaderboard-8c5fc517d5.js.download"><link rel="prefetch" href="./prgm1_files/hackerrank_r_modules_contest_challenge_leaderboardv2_leaderboard-84b96408cf.js.download"><link rel="prefetch" href="./prgm1_files/hackerrank_r_commons_challenge_onboarding-bd4bb5d259.js.download"><link rel="prefetch" href="./prgm1_files/hackerrank_r_modules_challenge_onboarding-907bb92f0b.js.download"><link rel="prefetch" href="./prgm1_files/hackerrank_r_vendors_challenge_onboarding-47846c20fe.js.download"><link rel="prefetch" href="./prgm1_files/hackerrank_r_vendors_challenge-7ff3a0e64d.js.download"><link rel="prefetch" href="./prgm1_files/hackerrank_r_vendors_challenge-4a9ee95d.css"><link rel="prefetch" href="./prgm1_files/hackerrank_r_modules_work_iframeable_pricing_container_contest_challenge_leaderboardv2_leaderboard_scoring-e006baf3.css"><link rel="prefetch" href="./prgm1_files/hackerrank_r_modules_work_contest_challenge_leaderboardv2_leaderboard-b29699bf.css"><link rel="prefetch" href="./prgm1_files/hackerrank_r_modules_contest_challenge_leaderboardv2_leaderboard-f0cda4f7.css"><link rel="prefetch" href="./prgm1_files/hackerrank_r_modules_challenge_onboarding-af28758e.css"><link rel="prefetch" href="./prgm1_files/hackerrank_r_commons_challenge_onboarding-9df78632.css"><link rel="prefetch" href="./prgm1_files/hackerrank_r_challenge-d9a1cf54.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_contest-ee34e4856d.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_commons~contest~leaderboardv2~leaderboard-dc911741c5.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_commons~contest~leaderboardv2~leaderboard-97bf8b13.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_contest-6a552a56.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_leaderboardv2-35c4b112f0.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_leaderboardv2-814d5be6.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_company_header-7862ba6326.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_company_header-cd8ab133.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_jobs-47fd1bd839.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_modules~work~survey~skills_verification_test~jobs~profile_v2-2bbcb61e11.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_vendors~work~survey~skills_verification_test~jobs~profile_v2-80260500bb.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_commons~dashboard~skills_verification~skills_verification_test~jobs-c9cda73034.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_modules~dashboard~skills_verification~skills_verification_test~jobs-2f9ed35a27.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_commons~skills_verification_test~jobs~profile_v2-e82ff04122.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_modules~jobs~sourcing_applications~sourcing_messages-d23c2bcc50.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_modules~survey~skills_verification_test~jobs-e339a6cf49.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_commons~skills_verification_test~jobs-e9e6cb4255.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_modules~jobs~sourcing_messages-a4f507e864.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_modules~work~jobs-65e26591ad.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_vendors~jobs~testquestions-c31e80cf84.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_vendors~skills_verification_test~jobs-a82aebd297.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_sourcing_company_jobs-d8e322ca7f.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_vendors~jobs-7ea8b39143.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_vendors~skills_verification_test~jobs-a8dbc1fc.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_vendors~jobs-6cc4efb3.css"><link rel="prefetch" href="./prgm1_files/hackerrank_r_modules_community_testsettings_library_sso_settings_sourcing_company_jobs_sourcing_applications_sourcing_company-765bee6d.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_modules~work~survey~skills_verification_test~jobs~profile_v2-ac9bd11b.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_modules~dashboard~skills_verification~skills_verification_test~jobs-db12a6db.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_modules~jobs~sourcing_applications~sourcing_messages-797184e6.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_modules~survey~skills_verification_test~jobs-c70b520d.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_modules~jobs~sourcing_messages-c05ffeb5.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_modules~work~jobs-812f27d6.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_commons~dashboard~skills_verification~skills_verification_test~jobs-ed430722.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_commons~skills_verification_test~jobs~profile_v2-92cad350.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_commons~skills_verification_test~jobs-e1f21e95.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_jobs-5487bc77.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_sourcing_company_jobs-10d6ff3e.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_skills_verification-3d2e64c29b.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_commons~skills_verification~skills_verification_test-8a74a131d6.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_commons~skills_verification~skills_verification_test-8763dfd8.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_skills_verification-52f41f60.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_skills_verification_test-c89ad6e1f4.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_skills_verification_test-2c3dd301.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_dashboard-7bf9779d3a.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_dashboard-0f145c23.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_leaderboard-25b551c286.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_leaderboard-f8f7a28a.css"><style>
html.scroll-hidden,html.scroll-hidden body{
  overflow: hidden;
  height:100vh;
}
html.scroll-hidden.pad-adjustment body{
    padding-right : 17px;
}
html.scroll-hidden.pad-adjustment .fixed-elm{
    padding-right : 17px;
}</style><script charset="utf-8" src="./prgm1_files/hackerrank_r_old_trimmed-f27c5d7cab.js.download"></script><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_survey-eefc1a2eb9.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_survey-e68f1d91.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_profile_v2-8f5a412c55.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_modules~profile_v2-a10e641954.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_modules~profile_v2-6e74f440.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_profile_v2-7e6d8443.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_calendar-beb5319ceb.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_vendors~calendar-a636a3a0be.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_calendar-7d47d728.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_onboarding-323b718930.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_modules~onboarding-a282caf0be.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_modules~onboarding-8a2b1d57.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_onboarding-d2c0481b.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_charts-d4c56e1c44.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_charts-5ca2c9c7.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_scoring-261d796af4.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_scoring-2689cc73.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_interview-ea518712f7.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_vendors~interview-695db269ba.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_vendors~interview-db12a6db.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_interview-ecb732b4.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_auth-4098f9a7d3.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_auth-7850f377.css"><link rel="prefetch" href="./prgm1_files/hackerrank_r_krackjack-96f7c45301.js.download"><link rel="prefetch" href="./prgm1_files/hackerrank_r_modules_krackjack-86d6d47a04.js.download"><link rel="prefetch" href="./prgm1_files/hackerrank_r_vendors_krackjack-b2a7c7bed3.js.download"><link rel="prefetch" href="./prgm1_files/hackerrank_r_vendors_krackjack-b64bcb40.css"><link rel="prefetch" href="./prgm1_files/hackerrank_r_modules_krackjack-12205c4d.css"><script charset="utf-8" src="./prgm1_files/hackerrank_r_modules_challenge_list_challenge_list_v2_challenge_jobs_profile_v2_interview_singletest_library_teams-fe1fb30cfd.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_modules_challenge_list_challenge_list_v2_challenge_onboarding_profile_v2_interview-3de4e57f37.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_modules_challenge_list_challenge_list_v2_challenge_interview-268b72dbe6.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_modules_challenge_list_challenge_list_v2_interview-96bcfca26d.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_vendors_work_challenge_list_challenge_list_v2_challenge_jobs_calendar_onboarding_scoring_interview-a1056a3145.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_vendors_challenge_list_challenge_list_v2_jobs_scoring_interview-2103a30f32.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_commons_challenge_list_challenge_list_v2_challenge_onboarding_profile_v2_interview-8ea038a254.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_commons_challenge_list_challenge_list_v2_challenge_interview-8f83157c49.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_commons_challenge_list_challenge_list_v2_interview-ca86b08a75.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_challenge_list-7a4def2f99.js.download"></script><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_intersection_observer-65d5a5ccb7.js"><link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_modules_work_iframeable_pricing_container_contest_challenge_leaderboardv2_leaderboard_scoring-e006baf3.css"><script charset="utf-8" src="./prgm1_files/hackerrank_r_modules_work_iframeable_pricing_container_contest_challenge_leaderboardv2_leaderboard_scoring-d2c587e4c2.js.download"></script><link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_modules_work_contest_challenge_leaderboardv2_leaderboard-b29699bf.css"><script charset="utf-8" src="./prgm1_files/hackerrank_r_modules_work_contest_challenge_leaderboardv2_leaderboard-8c5fc517d5.js.download"></script><link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_modules_contest_challenge_leaderboardv2_leaderboard-f0cda4f7.css"><script charset="utf-8" src="./prgm1_files/hackerrank_r_modules_contest_challenge_leaderboardv2_leaderboard-84b96408cf.js.download"></script><link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_modules_challenge_onboarding-af28758e.css"><script charset="utf-8" src="./prgm1_files/hackerrank_r_modules_challenge_onboarding-907bb92f0b.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_vendors_challenge_onboarding-47846c20fe.js.download"></script><link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_vendors_challenge-4a9ee95d.css"><script charset="utf-8" src="./prgm1_files/hackerrank_r_vendors_challenge-7ff3a0e64d.js.download"></script><link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_commons_contest_challenge_leaderboardv2_forum_leaderboard-1db2de8d.css"><script charset="utf-8" src="./prgm1_files/hackerrank_r_commons_contest_challenge_leaderboardv2_forum_leaderboard-25d1292083.js.download"></script><link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_commons_challenge_onboarding-9df78632.css"><script charset="utf-8" src="./prgm1_files/hackerrank_r_commons_challenge_onboarding-bd4bb5d259.js.download"></script><link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_challenge-d9a1cf54.css"><script charset="utf-8" src="./prgm1_files/hackerrank_r_challenge-de8d6bca0e.js.download"></script><link rel="prefetch" href="https://hrcdn.net/fcore/assets/codeshell_editor_theme_m-8df55d227a.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/codeshell_editor_theme_m-ae46fe27.css"><link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_modules_krackjack-12205c4d.css"><script charset="utf-8" src="./prgm1_files/hackerrank_r_modules_krackjack-86d6d47a04.js.download"></script><link rel="stylesheet" type="text/css" href="./prgm1_files/hackerrank_r_vendors_krackjack-b64bcb40.css"><script charset="utf-8" src="./prgm1_files/hackerrank_r_vendors_krackjack-b2a7c7bed3.js.download"></script><script charset="utf-8" src="./prgm1_files/hackerrank_r_krackjack-96f7c45301.js.download"></script><style type="text/css" media="screen" class="monaco-colors">.monaco-editor .accessibilityHelpWidget { background-color: #efeff2; }
.monaco-editor .accessibilityHelpWidget { box-shadow: 0 2px 8px #a8a8a8; }
.monaco-editor, .monaco-editor-background, .monaco-editor .inputarea.ime-input { background-color: #fffffe; }
.monaco-editor, .monaco-editor .inputarea.ime-input { color: #000000; }
.monaco-editor .margin { background-color: #fffffe; }
.monaco-editor .rangeHighlight { background-color: rgba(253, 255, 0, 0.2); }
.vs-whitespace { color: rgba(51, 51, 51, 0.2) !important; }
.monaco-editor .bracket-match { background-color: rgba(0, 100, 0, 0.1); }
.monaco-editor .bracket-match { border: 1px solid #b9b9b9; }
.monaco-editor .monaco-editor-overlaymessage .anchor { border-top-color: #007acc; }
.monaco-editor .monaco-editor-overlaymessage .message { border: 1px solid #007acc; }
.monaco-editor .monaco-editor-overlaymessage .message { background-color: #d6ecf2; }
.monaco-editor .codelens-decoration { color: #999999; }
.monaco-editor .codelens-decoration > a:hover { color: #0000ff !important; }
.monaco-editor .findMatch { background-color: rgba(234, 92, 0, 0.33); }
.monaco-editor .currentFindMatch { background-color: #a8ac94; }
.monaco-editor .findScope { background-color: rgba(180, 180, 180, 0.3); }
.monaco-editor .find-widget { background-color: #efeff2; }
.monaco-editor .find-widget { box-shadow: 0 2px 8px #a8a8a8; }
.monaco-editor .find-widget.no-results .matchesCount { color: #a1260d; }
.monaco-editor .find-widget .monaco-sash { background-color: #c8c8c8; width: 3px !important; margin-left: -4px;}
.monaco-editor .findOptionsWidget { background-color: #efeff2; }
.monaco-editor .findOptionsWidget { box-shadow: 0 2px 8px #a8a8a8; }
.monaco-editor .line-numbers { color: #237893; }
.monaco-editor .current-line ~ .line-numbers { color: #0b216f; }
.monaco-editor .view-overlays .current-line { background-color: #eaf2fe; }
.monaco-editor .margin-view-overlays .current-line-margin { background-color: #eaf2fe; border: none; }
.monaco-editor .lines-content .cigr { box-shadow: 1px 0 0 0 #d3d3d3 inset; }
.monaco-editor .lines-content .cigra { box-shadow: 1px 0 0 0 #939393 inset; }
.monaco-editor .view-ruler { box-shadow: 1px 0 0 0 #d3d3d3 inset; }
.monaco-editor .scroll-decoration { box-shadow: #dddddd 0 6px 6px -6px inset; }
.monaco-editor .focused .selected-text { background-color: #add6ff; }
.monaco-editor .selected-text { background-color: #e5ebf1; }
.monaco-editor .cursor { background-color: #000000; border-color: #000000; color: #ffffff; }
.monaco-editor .minimap-slider, .monaco-editor .minimap-slider .minimap-slider-horizontal { background: rgba(100, 100, 100, 0.2); }
.monaco-editor .minimap-slider:hover, .monaco-editor .minimap-slider:hover .minimap-slider-horizontal { background: rgba(100, 100, 100, 0.35); }
.monaco-editor .minimap-slider.active, .monaco-editor .minimap-slider.active .minimap-slider-horizontal { background: rgba(0, 0, 0, 0.3); }
.monaco-editor .minimap-shadow-visible { box-shadow: #dddddd -6px 0 6px -6px inset; }
.monaco-editor .squiggly-error { background: url("data:image/svg+xml,%3Csvg%20xmlns%3D'http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg'%20viewBox%3D'0%200%206%203'%20enable-background%3D'new%200%200%206%203'%20height%3D'3'%20width%3D'6'%3E%3Cg%20fill%3D'%23d60a0a'%3E%3Cpolygon%20points%3D'5.5%2C0%202.5%2C3%201.1%2C3%204.1%2C0'%2F%3E%3Cpolygon%20points%3D'4%2C0%206%2C2%206%2C0.6%205.4%2C0'%2F%3E%3Cpolygon%20points%3D'0%2C2%201%2C3%202.4%2C3%200%2C0.6'%2F%3E%3C%2Fg%3E%3C%2Fsvg%3E") repeat-x bottom left; }
.monaco-editor .squiggly-warning { background: url("data:image/svg+xml,%3Csvg%20xmlns%3D'http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg'%20viewBox%3D'0%200%206%203'%20enable-background%3D'new%200%200%206%203'%20height%3D'3'%20width%3D'6'%3E%3Cg%20fill%3D'%23117711'%3E%3Cpolygon%20points%3D'5.5%2C0%202.5%2C3%201.1%2C3%204.1%2C0'%2F%3E%3Cpolygon%20points%3D'4%2C0%206%2C2%206%2C0.6%205.4%2C0'%2F%3E%3Cpolygon%20points%3D'0%2C2%201%2C3%202.4%2C3%200%2C0.6'%2F%3E%3C%2Fg%3E%3C%2Fsvg%3E") repeat-x bottom left; }
.monaco-editor .squiggly-info { background: url("data:image/svg+xml,%3Csvg%20xmlns%3D'http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg'%20viewBox%3D'0%200%206%203'%20enable-background%3D'new%200%200%206%203'%20height%3D'3'%20width%3D'6'%3E%3Cg%20fill%3D'%23008000'%3E%3Cpolygon%20points%3D'5.5%2C0%202.5%2C3%201.1%2C3%204.1%2C0'%2F%3E%3Cpolygon%20points%3D'4%2C0%206%2C2%206%2C0.6%205.4%2C0'%2F%3E%3Cpolygon%20points%3D'0%2C2%201%2C3%202.4%2C3%200%2C0.6'%2F%3E%3C%2Fg%3E%3C%2Fsvg%3E") repeat-x bottom left; }
.monaco-editor .squiggly-hint { background: url("data:image/svg+xml,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20height%3D%223%22%20width%3D%2212%22%3E%3Cg%20fill%3D%22%236c6c6c%22%3E%3Ccircle%20cx%3D%221%22%20cy%3D%221%22%20r%3D%221%22%2F%3E%3Ccircle%20cx%3D%225%22%20cy%3D%221%22%20r%3D%221%22%2F%3E%3Ccircle%20cx%3D%229%22%20cy%3D%221%22%20r%3D%221%22%2F%3E%3C%2Fg%3E%3C%2Fsvg%3E") no-repeat bottom left; }
.showUnused .monaco-editor .squiggly-inline-unnecessary { opacity: 0.467; will-change: opacity; }
.monaco-editor .reference-zone-widget .ref-tree .referenceMatch { background-color: rgba(234, 92, 0, 0.3); }
.monaco-editor .reference-zone-widget .preview .reference-decoration { background-color: rgba(245, 216, 2, 0.87); }
.monaco-editor .reference-zone-widget .ref-tree { background-color: #f3f3f3; }
.monaco-editor .reference-zone-widget .ref-tree { color: #646465; }
.monaco-editor .reference-zone-widget .ref-tree .reference-file { color: #1e1e1e; }
.monaco-editor .reference-zone-widget .ref-tree .monaco-tree.focused .monaco-tree-rows > .monaco-tree-row.selected:not(.highlighted) { background-color: rgba(51, 153, 255, 0.2); }
.monaco-editor .reference-zone-widget .ref-tree .monaco-tree.focused .monaco-tree-rows > .monaco-tree-row.selected:not(.highlighted) { color: #6c6c6c !important; }
.monaco-editor .reference-zone-widget .preview .monaco-editor .monaco-editor-background,.monaco-editor .reference-zone-widget .preview .monaco-editor .inputarea.ime-input {	background-color: #f2f8fc;}
.monaco-editor .reference-zone-widget .preview .monaco-editor .margin {	background-color: #f2f8fc;}
.monaco-editor .goto-definition-link { color: #0000ff !important; }
.monaco-editor .hoverHighlight { background-color: rgba(173, 214, 255, 0.15); }
.monaco-editor .monaco-editor-hover { background-color: #efeff2; }
.monaco-editor .monaco-editor-hover { border: 1px solid #c8c8c8; }
.monaco-editor .monaco-editor-hover .hover-row:not(:first-child):not(:empty) { border-top: 1px solid rgba(200, 200, 200, 0.5); }
.monaco-editor .monaco-editor-hover a { color: #006ab1; }
.monaco-editor .monaco-editor-hover code { background-color: rgba(220, 220, 220, 0.4); }
.monaco-editor.vs .valueSetReplacement { outline: solid 2px #b9b9b9; }
.monaco-editor .tokens-inspect-widget { border: 1px solid #c8c8c8; }
.monaco-editor .tokens-inspect-widget .tokens-inspect-separator { background-color: #c8c8c8; }
.monaco-editor .tokens-inspect-widget { background-color: #efeff2; }
.monaco-editor .detected-link-active { color: #0000ff !important; }
.monaco-editor .parameter-hints-widget { border: 1px solid #c8c8c8; }
.monaco-editor .parameter-hints-widget.multiple .body { border-left: 1px solid rgba(200, 200, 200, 0.5); }
.monaco-editor .parameter-hints-widget .signature.has-docs { border-bottom: 1px solid rgba(200, 200, 200, 0.5); }
.monaco-editor .parameter-hints-widget { background-color: #efeff2; }
.monaco-editor .parameter-hints-widget a { color: #006ab1; }
.monaco-editor .parameter-hints-widget code { background-color: rgba(220, 220, 220, 0.4); }
.monaco-editor .suggest-widget .monaco-list .monaco-list-row .monaco-highlighted-label .highlight { color: #007acc; }
.monaco-editor .suggest-widget { color: #000000; }
.monaco-editor .suggest-widget a { color: #006ab1; }
.monaco-editor .suggest-widget code { background-color: rgba(220, 220, 220, 0.4); }
.monaco-editor .focused .selectionHighlight { background-color: rgba(173, 214, 255, 0.3); }
.monaco-editor .selectionHighlight { background-color: rgba(173, 214, 255, 0.15); }
.monaco-editor .wordHighlight { background-color: rgba(87, 87, 87, 0.25); }
.monaco-editor .wordHighlightStrong { background-color: rgba(14, 99, 156, 0.25); }
.monaco-diff-editor .diff-review-line-number { color: #237893; }
.monaco-diff-editor .diff-review-shadow { box-shadow: #dddddd 0 -6px 6px -6px inset; }
.monaco-editor .line-insert, .monaco-editor .char-insert { background-color: rgba(155, 185, 85, 0.2); }
.monaco-diff-editor .line-insert, .monaco-diff-editor .char-insert { background-color: rgba(155, 185, 85, 0.2); }
.monaco-editor .inline-added-margin-view-zone { background-color: rgba(155, 185, 85, 0.2); }
.monaco-editor .line-delete, .monaco-editor .char-delete { background-color: rgba(255, 0, 0, 0.2); }
.monaco-diff-editor .line-delete, .monaco-diff-editor .char-delete { background-color: rgba(255, 0, 0, 0.2); }
.monaco-editor .inline-deleted-margin-view-zone { background-color: rgba(255, 0, 0, 0.2); }
.monaco-diff-editor.side-by-side .editor.modified { box-shadow: -6px 0 5px -5px #dddddd; }

.mtk1 { color: #000000; }
.mtk2 { color: #fffffe; }
.mtk3 { color: #808080; }
.mtk4 { color: #ff0000; }
.mtk5 { color: #0451a5; }
.mtk6 { color: #0000ff; }
.mtk7 { color: #09885a; }
.mtk8 { color: #008000; }
.mtk9 { color: #dd0000; }
.mtk10 { color: #383838; }
.mtk11 { color: #cd3131; }
.mtk12 { color: #863b00; }
.mtk13 { color: #af00db; }
.mtk14 { color: #800000; }
.mtk15 { color: #e00000; }
.mtk16 { color: #3030c0; }
.mtk17 { color: #666666; }
.mtk18 { color: #778899; }
.mtk19 { color: #ff00ff; }
.mtk20 { color: #608b4e; }
.mtk21 { color: #a31515; }
.mtk22 { color: #4f76ac; }
.mtk23 { color: #008080; }
.mtk24 { color: #001188; }
.mtk25 { color: #4864aa; }
.mtki { font-style: italic; }
.mtkb { font-weight: bold; }
.mtku { text-decoration: underline; text-underline-position: under; }</style><script charset="utf-8" src="./prgm1_files/hackerrank_r_vendors_unknown-chunk-caa8d05303.js.download"></script><style type="text/css" media="screen"></style><title> Welcome to Java! | HackerRank </title><meta name="description" id="meta-description" content="Practice printing to stdout."><meta property="og:title" id="meta-og-title" content="Welcome to Java! | HackerRank"><meta property="og:description" id="meta-og-description" content="Practice printing to stdout."><meta property="og:url" id="meta-og-url" content="https://www.hackerrank.com/challenges/welcome-to-java/problem"><meta name="twitter:url" id="meta-twitter-url" content="https://www.hackerrank.com/challenges/welcome-to-java/problem"><meta name="twitter:title" id="meta-twitter-title" content="Welcome to Java! | HackerRank"></head>
<body id="hr_v2" class="hr-community">
  <div id="fb-root"></div>
  

  <!-- Just a placeholder div to start loading open sans and source code loader -->
  <div class="font-open-sans-loader"></div>
  <div class="font-source-code-loader"></div>
  <!-- Just a placeholder div to start loading open sans and source code loader end -->

  <div id="content" onclick="void(0);"><div class="ui-kit-root"><div class="body-wrap community-page challenges-page problem-page show-cookie-banner" style=""><div class="cookie-banner-wrapper"><div class="cookie-container"><div class="cookie-message">We use cookies to ensure you have the best browsing experience on our website. Please read our <a target="_blank" class="cookie-link" href="https://www.hackerrank.com/privacy#cookies">cookie policy</a> for more information about how we use cookies.</div><div class="cookie-btn-wrapper theme-m"><button class="ui-btn ui-btn-normal ui-btn-secondary" tabindex="0"><div class="ui-content align-icon-right"><span class="ui-text">Ok</span></div></button></div></div></div><div class="theme-m new-design"><div class="page-header-wrapper theme-m-section"><nav class="community-header"><div class="container"><div class="header-nav-links theme-m-section"><ul class="nav-links"><li class="nav-link-item logo-wrap"><a class="nav_link backbone logo_mark js_logo_mark logo-link" data-analytics="NavBarLogo" data-attr1="/" href="https://www.hackerrank.com/"><img id="feed-intro" class="logo-img-small" src="./prgm1_files/h_mark_sm-966d2b45e3.svg" alt=""></a></li><li class="nav-link-item"><a class="nav-link dashboard active" data-analytics="NavBarDomains" href="https://www.hackerrank.com/dashboard"><span>Practice</span></a></li><li class="nav-link-item"><a class="nav-link contests" data-analytics="NavBarContests" href="https://www.hackerrank.com/contests"><span>Compete</span></a></li><li class="nav-link-item"><a class="nav-link" data-analytics="NavBarJobs" href="https://www.hackerrank.com/jobs"><span>Jobs</span><i class="ui-icon-circle-filled notification-indicator hidden"></i></a></li><li class="nav-link-item"><a class="nav-link" data-analytics="NavBarLeaderboard" id="leaderboard-nav-link" href="https://www.hackerrank.com/leaderboard"><span>Leaderboard</span></a></li></ul></div><div class="nav-buttons theme-m-section"><ul class="pull-left psR"><li class="hide-in-private-contest search-input-container input-icon main-hr-search" id="search-span"><div class="search-form new-search"><div><div class="search-query asyn-autocomplete autocomplete"><div class="ac-input-wrap cf"><input autocomplete="off" class="ac-input " value="" placeholder="Search"></div></div><i class="ui-icon-search"></i></div></div></li></ul><ul class="pull-left nav-wrap mmL"><li class="nav-btn button-item"><a class="ui-btn ui-btn-normal ui-btn-plain nav-buttons__hiring-dev-link ui-btn-link" tabindex="0" data-analytics="NavBarLoginIcon" href="https://www.hackerrank.com/products/?h_r=hrc&amp;h_l=header"><div class="ui-content align-icon-right"><span class="ui-text">Hiring developers?</span></div></a></li><li class="nav-btn button-item"><button class="login pull-right btn btn-dark btn-default mmT" data-analytics="NavBarLoginIcon"> Log In </button></li><li class="nav-btn button-item"><button href="/auth/signup/master" class="nav-signup pull-right btn btn-primary mmT" data-analytics="NavBarSignupIcon"> Sign Up</button></li></ul></div></div></nav></div><header class="community-header-breadcrumb"><div class="container"><div class="d-flex justify-content-between align-items-center content-header-wrapper"><div class="community-header-breadcrumb-items"><ol itemtype="http://schema.org/BreadcrumbList" class="community-breadcrumb text-content ellipsis"><li itemprop="itemListElement" itemtype="http://schema.org/ListItem" class="breadcrumb-item"><a itemprop="item" class="breadcrumb-link" data-analytics="Breadcrumb" data-attr1="Practice" data-attr2="global" data-attr7="1" href="https://www.hackerrank.com/dashboard"><span itemprop="name" class="breadcrumb-item-text">Practice</span></a><meta itemprop="position" content="1"></li><li itemprop="itemListElement" itemtype="http://schema.org/ListItem" class="breadcrumb-item"><span class="ui-icon-chevron-right mmL mmR chevron-icon"></span><a itemprop="item" class="breadcrumb-link" data-analytics="Breadcrumb" data-attr1="Java" data-attr2="global" data-attr7="1" href="https://www.hackerrank.com/domains/java"><span itemprop="name" class="breadcrumb-item-text">Java</span></a><meta itemprop="position" content="1"></li><li itemprop="itemListElement" itemtype="http://schema.org/ListItem" class="breadcrumb-item"><span class="ui-icon-chevron-right mmL mmR chevron-icon"></span><a itemprop="item" class="breadcrumb-link" data-analytics="Breadcrumb" data-attr1="Introduction" data-attr2="global" data-attr7="1" href="https://www.hackerrank.com/domains/java/java-introduction"><span itemprop="name" class="breadcrumb-item-text">Introduction</span></a><meta itemprop="position" content="1"></li><li itemprop="itemListElement" itemtype="http://schema.org/ListItem" class="breadcrumb-item"><span class="ui-icon-chevron-right mmL mmR chevron-icon"></span><span itemprop="name" class="breadcrumb-item-text">Welcome to Java!</span><meta itemprop="position" content="1"></li></ol><div class="page-label-wrapper text-headline"><h1 class="page-label"><div class="challenge-page-label-wrapper align-items-center"><h1 class="ui-icon-label page-label">Welcome to Java!</h1></div></h1></div></div><div class="community-header-aside"><div class="challenge-header-aside"></div></div></div></div></header><div class="container"></div><div class="community-content"><div class="challenge-view theme-m"><div class="challenge-page-header container"><div class="ui-tabs-wrap"><div class="render-list clearfix"><ul class="tab-header"><li id="Problem" class="tab-item active"><a class="tab-item-color" data-analytics="ChallengeViewTab" data-attr1="/challenges/welcome-to-java/problem" data-attr2="Problem" data-attr3="no_full_screen" href="https://www.hackerrank.com/challenges/welcome-to-java/problem"><span class="ui-icon-label">Problem</span></a></li><li id="Submissions" class="tab-item"><a class="tab-item-color" data-analytics="ChallengeViewTab" data-attr1="/challenges/welcome-to-java/submissions" data-attr2="Submissions" data-attr3="no_full_screen" href="https://www.hackerrank.com/challenges/welcome-to-java/submissions"><span class="ui-icon-label">Submissions</span></a></li><li id="Leaderboard" class="tab-item"><a class="tab-item-color" data-analytics="ChallengeViewTab" data-attr1="/challenges/welcome-to-java/leaderboard" data-attr2="Leaderboard" data-attr3="no_full_screen" href="https://www.hackerrank.com/challenges/welcome-to-java/leaderboard"><span class="ui-icon-label">Leaderboard</span></a></li><li id="Discussions" class="tab-item"><a class="tab-item-color" data-analytics="ChallengeViewTab" data-attr1="/challenges/welcome-to-java/forum" data-attr2="Discussions" data-attr3="no_full_screen" href="https://www.hackerrank.com/challenges/welcome-to-java/forum"><span class="ui-icon-label">Discussions</span></a></li><li id="Editorial" class="tab-item"><a class="tab-item-color" data-analytics="ChallengeViewTab" data-attr1="/challenges/welcome-to-java/editorial" data-attr2="Editorial" data-attr3="no_full_screen" href="https://www.hackerrank.com/challenges/welcome-to-java/editorial"><span class="ui-icon-label">Editorial</span><i class="ui-icon-lock"></i></a></li></ul></div></div></div><section class="challenge-interface challenge-problem"><div class="challenge-body"><div class="challenge-body-elements-problem challenge-container-element"><div class="container challenge-page-wrap panes-container theme-m-content"><div class="full-screen-split split-wrap left-pane"><section class="problem-statement split"><div class="ui-tabs-wrap"><div class="tab-list-content"><div class="theme-m hr_tour-problem-statement problem-statement have-external-links"><div class="content-text challenge-text mlB hackdown-container theme-m"><div class="challenge-body-html"><div class="challenge_problem_statement"><div class="msB challenge_problem_statement_body"><div class="hackdown-content"><style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%}
.MathJax_SVG .MJX-monospace {font-family: monospace}
.MathJax_SVG .MJX-sans-serif {font-family: sans-serif}
.MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0}
.MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none}
.mjx-svg-href {fill: blue; stroke: blue}
</style><svg style="display: none;"><defs id="MathJax_SVG_glyphs"></defs></svg><p>Welcome to the world of Java! In this challenge, we practice printing to stdout.</p>

<p>The code stubs in your editor declare a <em>Solution</em> class and a <em>main</em> method. Complete the <em>main</em> method by copying the two lines of code below and pasting them inside the body of your <em>main</em> method.</p>

<div class="highlight"><pre><span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">"Hello, World."</span><span class="o">);</span>
<span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">"Hello, Java."</span><span class="o">);</span>
</pre></div>
</div></div></div><div class="challenge_input_format"><div class="msB challenge_input_format_title"><p><strong>Input Format</strong></p></div><div class="msB challenge_input_format_body"><div class="hackdown-content"><style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%}
.MathJax_SVG .MJX-monospace {font-family: monospace}
.MathJax_SVG .MJX-sans-serif {font-family: sans-serif}
.MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0}
.MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none}
.mjx-svg-href {fill: blue; stroke: blue}
</style><svg style="display: none;"><defs id="MathJax_SVG_glyphs"></defs></svg><p>There is no input for this challenge.</p></div></div></div><div class="challenge_output_format"><div class="msB challenge_output_format_title"><p><strong>Output Format</strong></p></div><div class="msB challenge_output_format_body"><div class="hackdown-content"><style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%}
.MathJax_SVG .MJX-monospace {font-family: monospace}
.MathJax_SVG .MJX-sans-serif {font-family: sans-serif}
.MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0}
.MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none}
.mjx-svg-href {fill: blue; stroke: blue}
</style><svg style="display: none;"><defs id="MathJax_SVG_glyphs"></defs></svg><p>You must print two lines of output:</p>

<ol>
<li>Print <code>Hello, World.</code> on the first line.</li>
<li>Print <code>Hello, Java.</code> on the second line.</li>
</ol></div></div></div><div class="challenge_sample_output"><div class="msB challenge_sample_output_title"><p><strong>Sample Output</strong></p></div><div class="msB challenge_sample_output_body"><div class="hackdown-content"><style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%}
.MathJax_SVG .MJX-monospace {font-family: monospace}
.MathJax_SVG .MJX-sans-serif {font-family: sans-serif}
.MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0}
.MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none}
.mjx-svg-href {fill: blue; stroke: blue}
</style><svg style="display: none;"><defs id="MathJax_SVG_glyphs"></defs></svg><pre><code>Hello, World.
Hello, Java.
</code></pre></div></div></div></div></div></div></div></div></section><section class="code-editor-section split"><div><div></div><section class="theme-dark dark-mode-panel monospace"><div class="ui-card ui-layer-2"><div class="card-content"><article class="dark-mode-intro"><div class="dark-mode-intro-content"><h2 class="dark-mode-intro-title">Welcome to the dark side!</h2><p class="dark-mode-intro-description">We've introduced a new Dark Mode for a better coding experience.</p></div><button class="ui-btn ui-btn-normal ui-btn-secondary dark-mode-intro-start-btn" tabindex="0"><div class="ui-content align-icon-right"><span class="ui-text">Try Dark Mode</span></div></button><button class="ui-icon-btn ui-btn-normal dark-mode-intro-dismiss-btn"><span class="sr-only">Dismiss the introduction</span><svg viewBox="0 0 100 100" width="1em" height="1em" aria-hidden="true" focusable="false" class=" ui-svg-icon" fill="currentColor"><path d="M88.184 81.468a3.008 3.008 0 0 1 0 4.242l-2.475 2.475a3.008 3.008 0 0 1-4.242 0l-69.65-69.65a3.008 3.008 0 0 1 0-4.242l2.476-2.476a3.008 3.008 0 0 1 4.242 0l69.649 69.651z"></path><path d="M18.532 88.184a3.01 3.01 0 0 1-4.242 0l-2.475-2.475a3.008 3.008 0 0 1 0-4.242l69.65-69.651a3.008 3.008 0 0 1 4.242 0l2.476 2.476a3.01 3.01 0 0 1 0 4.242l-69.651 69.65z"></path></svg></button></article></div></div></section><div class="hr-monaco-editor-wrapper"><div class="hr-monaco-editor-with-input"><div><div class="hr-monaco-editor-with-statusbar"><div class="hr-monaco-editor"><div class="editor-toolbar"><div class="toolbar-left"></div><div class="toolbar-right"><div class="toolbar-custom-items"><div class="theme-change-wrapper"><div class="dropdown"><div aria-haspopup="menu" class="dropdown-handle theme-change-handle"><span class="text-link">Change Theme</span></div><div role="menu" class="dropdown-body align-center" aria-hidden="true" tabindex="-1"><div class="arrow"></div><div class="btn-group change-theme-btn-group"><button class="ui-btn ui-btn-normal ui-btn-line active" tabindex="0" data-automation="btn-light"><div class="ui-content align-icon-right"><span class="ui-text">Light</span></div></button><button class="ui-btn ui-btn-normal ui-btn-line" tabindex="0" data-automation="btn-dark"><div class="ui-content align-icon-right"><span class="ui-text">Dark</span></div></button><button class="ui-btn ui-btn-normal ui-btn-line" tabindex="0" data-automation="btn-contrast"><div class="ui-content align-icon-right"><span class="ui-text">High Contrast</span></div></button></div></div></div></div></div><div class="Select  select-language has-value is-searchable Select--single"><div class="Select-control"><span class="Select-multi-value-wrapper" id="react-select-4--value"><div class="Select-value"><span class="Select-value-label" role="option" aria-selected="true" id="react-select-4--value-item">Java 8</span></div><div class="Select-input" style="display: inline-block;"><input aria-activedescendant="react-select-4--value" aria-expanded="false" aria-haspopup="false" aria-owns="" role="combobox" value="" style="box-sizing: content-box; width: 5px;"><div style="position: absolute; top: 0px; left: 0px; visibility: hidden; height: 0px; overflow: scroll; white-space: pre; font-size: 16px; font-family: OpenSans, Arial, Helvetica, sans-serif; font-weight: 400; font-style: normal; letter-spacing: normal; text-transform: none;"></div></div></span><span class="Select-arrow-zone"><span class="Select-arrow"></span></span></div></div><div class="toolbar-custom-items"><div class="hr-monaco-reset-code"><button class="ui-btn ui-btn-normal cursor reset-btn" tabindex="0" title="Reset Code" type="button"><div class="ui-content align-icon-right"><span class="ui-text"><i class="ui-icon-reset-code icon-grey reset-icon"></i></span></div></button></div><div class="fullscreen-btn-wrapper"><button class="ui-btn ui-btn-normal fullscreen fullscreen-btn no-select active-link hr-monaco-base-btn" tabindex="0" title="Switch to Full Screen layout" data-original-title="Switch to Full Screen layout"><div class="ui-content align-icon-right"><span class="ui-text"><i class="ui-icon-maximize icon-grey no-select"></i></span></div></button></div></div><div class="hr-monaco-settings-editor"><button class="ui-btn ui-btn-link cursor settings-toggle" tabindex="0" aria-haspopup="true" aria-expanded="false" aria-label="Editor Settings" title="Editor Settings"><i class="icon-cog ui-icon-settings icon-grey"></i></button></div></div></div><div class="hr-monaco-editor-parent"><div class="hr-monaco-base-editor showUnused" data-keybinding-context="1" data-mode-id="java" style="height: 396px;"><div class="monaco-editor vs focused" data-uri="file:///lsp-b354a2e0-47e6-11ea-9c83-0b427658af7b/Solution.java" style="width: 890px; height: 396px;"><div data-mprt="3" class="overflow-guard" style="width: 890px; height: 396px;"><div class="margin" role="presentation" aria-hidden="true" style="position: absolute; will-change: transform; top: 0px; height: 396px; width: 71px;"><div class="glyph-margin" style="left: 0px; width: 0px; height: 396px;"></div><div class="margin-view-zones" role="presentation" aria-hidden="true" style="position: absolute;"></div><div class="margin-view-overlays focused" role="presentation" aria-hidden="true" style="position: absolute; width: 71px; font-family: SourceCodePro, monospace; font-weight: normal; font-size: 15px; line-height: 20px; letter-spacing: 0px; height: 396px;"><div style="position:absolute;top:0px;width:100%;height:20px;"><div class="cldr folding alwaysShowFoldIcons" style="left:45px;width:26px;"></div><div class="line-numbers" style="left:0px;width:45px;">1</div></div><div style="position:absolute;top:20px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:45px;">2</div></div><div style="position:absolute;top:40px;width:100%;height:20px;"><div class="cldr folding alwaysShowFoldIcons" style="left:45px;width:26px;"></div><div class="line-numbers" style="left:0px;width:45px;">3</div></div><div style="position:absolute;top:60px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:45px;">4</div></div><div style="position:absolute;top:80px;width:100%;height:20px;"></div><div style="position:absolute;top:140px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:45px;">7</div></div><div style="position:absolute;top:160px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:45px;">8</div></div><div style="position:absolute;top:180px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:45px;">9</div></div><div style="position:absolute;top:100px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:45px;">5</div></div><div style="position:absolute;top:120px;width:100%;height:20px;"><div class="current-line" style="width:71px; height:20px;"></div><div class="line-numbers" style="left:0px;width:45px;">6</div></div><div style="position:absolute;top:200px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:45px;">10</div></div></div></div><div class="monaco-scrollable-element editor-scrollable vs" role="presentation" data-mprt="5" style="position: absolute; overflow: hidden; left: 71px; height: 396px; width: 819px;"><div class="lines-content monaco-editor-background" style="position: absolute; overflow: hidden; width: 1e+06px; height: 1e+06px; will-change: transform; top: 0px; left: 0px;"><div class="view-overlays focused" role="presentation" aria-hidden="true" style="position: absolute; height: 0px; width: 819px;"><div style="position:absolute;top:0px;width:100%;height:20px;"></div><div style="position:absolute;top:20px;width:100%;height:20px;"><div class="cigr" style="left:0px;height:20px;width:36px"></div></div><div style="position:absolute;top:40px;width:100%;height:20px;"><div class="cigr" style="left:0px;height:20px;width:36px"></div></div><div style="position:absolute;top:60px;width:100%;height:20px;"><div class="cigr" style="left:0px;height:20px;width:36px"></div><div class="cigra" style="left:36px;height:20px;width:36px"></div></div><div style="position:absolute;top:80px;width:100%;height:20px;"></div><div style="position: absolute; top: 140px; width: 100%; height: 20px;"><div class="cigr" style="left:0px;height:20px;width:36px"></div></div><div style="position: absolute; top: 160px; width: 100%; height: 20px;"></div><div style="position: absolute; top: 180px; width: 100%; height: 20px;"></div><div style="position:absolute;top:100px;width:100%;height:20px;"><div class="cigr" style="left:0px;height:20px;width:36px"></div><div class="cigra" style="left:36px;height:20px;width:36px"></div></div><div style="position:absolute;top:120px;width:100%;height:20px;"><div class="current-line" style="width:819px; height:20px;"></div><div class="cigr" style="left:0px;height:20px;width:36px"></div><div class="cigra" style="left:36px;height:20px;width:36px"></div></div><div style="position:absolute;top:200px;width:100%;height:20px;"></div></div><div role="presentation" aria-hidden="true" class="view-rulers"></div><div class="view-zones" role="presentation" aria-hidden="true" style="position: absolute;"></div><div class="view-lines" role="presentation" aria-hidden="true" data-mprt="7" style="position: absolute; font-family: SourceCodePro, monospace; font-weight: normal; font-size: 15px; line-height: 20px; letter-spacing: 0px; width: 819px; height: 396px;"><div style="top:0px;height:20px;" class="view-line"><span><span class="mtk6">public</span><span class="mtk1">&nbsp;</span><span class="mtk6">class</span><span class="mtk1">&nbsp;Solution&nbsp;{</span></span></div><div style="top:20px;height:20px;" class="view-line"><span><span>&nbsp;</span></span></div><div style="top:40px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk6">public</span><span class="mtk1">&nbsp;</span><span class="mtk6">static</span><span class="mtk1">&nbsp;</span><span class="mtk6">void</span><span class="mtk1">&nbsp;main(String[]&nbsp;args)&nbsp;{</span></span></div><div style="top:60px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk8">/*&nbsp;Enter&nbsp;your&nbsp;code&nbsp;here.&nbsp;Print&nbsp;output&nbsp;to&nbsp;STDOUT.&nbsp;Y</span><span class="mtk8">our&nbsp;class&nbsp;should&nbsp;be&nbsp;named&nbsp;</span></span></div><div style="top:80px;height:20px;" class="view-line"><span><span class="mtk8">Solution.&nbsp;*/</span></span></div><div style="top: 140px; height: 20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;}</span></span></div><div style="top: 160px; height: 20px;" class="view-line"><span><span class="mtk1">}</span></span></div><div style="top: 180px; height: 20px;" class="view-line"><span><span>&nbsp;</span></span></div><div style="top:100px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.print(</span><span class="mtk21">"Hello"</span><span class="mtk1">&nbsp;</span><span class="mtk21">","</span><span class="mtk1">&nbsp;+</span><span class="mtk21">"world."</span><span class="mtk1">);</span></span></div><div style="top:120px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.println(</span><span class="mtk21">"Hello"</span><span class="mtk1">&nbsp;</span><span class="mtk21">","</span><span class="mtk1">+</span><span class="mtk21">"java."</span><span class="mtk1">);</span></span></div><div style="top:200px;height:20px;" class="view-line"><span><span>&nbsp;</span></span></div></div><div data-mprt="1" class="contentWidgets" style="position: absolute; top: 0px;"><div class="lightbulb-glyph" title="Show Fixes (Ctrl+.)" widgetid="LightBulbWidget" style="position: absolute; visibility: hidden;"></div></div><div role="presentation" aria-hidden="true" class="cursors-layer cursor-line-style cursor-solid"><div class="cursor " style="height: 20px; top: 120px; left: 432px; font-family: SourceCodePro, monospace; font-weight: normal; font-size: 15px; line-height: 20px; letter-spacing: 0px; display: block; visibility: inherit; width: 2px;"></div></div></div><div role="presentation" aria-hidden="true" class="invisible scrollbar horizontal" style="position: absolute; width: 805px; height: 10px; left: 0px; bottom: 0px;"><div class="slider" style="position: absolute; top: 0px; left: 0px; height: 10px; will-change: transform; width: 805px;"></div></div><canvas class="decorationsOverviewRuler" aria-hidden="true" width="14" height="396" style="position: absolute; will-change: transform; top: 0px; right: 0px; width: 14px; height: 396px;"></canvas><div role="presentation" aria-hidden="true" class="invisible scrollbar vertical" style="position: absolute; width: 14px; height: 396px; right: 0px; top: 0px;"><div class="slider" style="position: absolute; top: 0px; left: 0px; width: 14px; will-change: transform; height: 396px;"></div></div></div><div role="presentation" aria-hidden="true" style="width: 890px;"></div><textarea data-mprt="6" class="inputarea" wrap="off" autocorrect="off" autocapitalize="off" autocomplete="off" spellcheck="false" aria-label="Editor content;Press Alt+F1 for Accessibility Options." role="textbox" aria-multiline="true" aria-haspopup="false" aria-autocomplete="both" style="font-family: SourceCodePro, monospace; font-weight: normal; font-size: 1px; line-height: 20px; letter-spacing: 0px; top: 120px; left: 503px; width: 1px; height: 1px;"></textarea><div class="monaco-editor-background textAreaCover line-numbers" style="position: absolute; top: 0px; left: 0px; width: 0px; height: 0px;"></div><div data-mprt="4" class="overlayWidgets" style="width: 890px;"><div class="accessibilityHelpWidget" role="dialog" aria-hidden="true" widgetid="editor.contrib.accessibilityHelpWidget" style="display: none; position: absolute;"><div role="document"></div></div><div class="monaco-editor-hover hidden" aria-hidden="true" role="presentation" widgetid="editor.contrib.modesGlyphHoverWidget" style="position: absolute;"></div></div><div data-mprt="8" class="minimap slider-mouseover" role="presentation" aria-hidden="true" style="position: absolute; left: 0px; width: 0px; height: 396px;"><div class="minimap-shadow-hidden" style="height: 396px;"></div><canvas width="1" height="396" style="position: absolute; left: 0px; width: 1px; height: 396px;"></canvas><div class="minimap-slider" style="position: absolute; will-change: transform; width: 0px;"><div class="minimap-slider-horizontal" style="position: absolute; width: 0px; height: 0px;"></div></div></div></div><div data-mprt="2" class="overflowingContentWidgets"><div class="monaco-editor rename-box" widgetid="__renameInputWidget" style="height: 20px; box-shadow: rgb(168, 168, 168) 0px 2px 8px; position: absolute; visibility: hidden; max-width: 1366px;"><input class="rename-input" type="text" aria-label="Rename input. Type new name and press Enter to commit." style="font-family: SourceCodePro, monospace; font-weight: normal; font-size: 15px; background-color: rgb(255, 255, 255); color: rgb(97, 97, 97); border-width: 0px; border-style: none;"></div><div class="monaco-editor-hover hidden" tabindex="0" widgetid="editor.contrib.modesContentHoverWidget" style="position: absolute; visibility: hidden; max-width: 1366px;"><div class="monaco-scrollable-element " role="presentation" style="position: relative; overflow: hidden;"><div class="monaco-editor-hover-content" style="overflow: hidden; font-size: 15px; line-height: 20px; max-height: 250px;"></div><div role="presentation" aria-hidden="true" class="invisible scrollbar horizontal" style="position: absolute;"><div class="slider" style="position: absolute; top: 0px; left: 0px; height: 10px; will-change: transform;"></div></div><div role="presentation" aria-hidden="true" class="invisible scrollbar vertical" style="position: absolute;"><div class="slider" style="position: absolute; top: 0px; left: 0px; width: 10px; will-change: transform;"></div></div><div class="shadow"></div><div class="shadow"></div><div class="shadow top-left-corner"></div></div></div><div class="editor-widget suggest-widget" widgetid="editor.widget.suggestWidget" style="position: absolute; visibility: inherit; max-width: 1366px; top: 120px; left: 350px; line-height: 20px;" monaco-visible-content-widget="true"><div class="message" style="background-color: rgb(239, 239, 242); border-color: rgb(200, 200, 200); display: none;" aria-hidden="true">No suggestions.</div><div class="tree" aria-hidden="true" style="display: none; background-color: rgb(239, 239, 242); border-color: rgb(200, 200, 200); height: 20px;"><div class="monaco-list list_id_2" role="tree" tabindex="0"><div class="monaco-scrollable-element " role="presentation" style="position: relative; overflow: hidden;"><div class="monaco-list-rows" style="overflow: hidden; top: 0px;"></div><div role="presentation" aria-hidden="true" class="invisible scrollbar horizontal" style="position: absolute; width: 0px; height: 0px; left: 0px; bottom: 0px;"><div class="slider" style="position: absolute; top: 0px; left: 0px; height: 10px; will-change: transform; width: 0px;"></div></div><div role="presentation" aria-hidden="true" class="invisible scrollbar vertical" style="position: absolute; width: 10px; height: 20px; right: 0px; top: 0px;"><div class="slider" style="position: absolute; top: 0px; left: 0px; width: 10px; will-change: transform; height: 20px;"></div></div></div><style type="text/css" media="screen">.monaco-list.list_id_2:focus .monaco-list-row.focused { background-color: #dff0ff; }
.monaco-list.list_id_2:focus .monaco-list-row.focused:hover { background-color: #dff0ff; }
.monaco-list.list_id_2:focus .monaco-list-row.selected { background-color: #2477ce; }
.monaco-list.list_id_2:focus .monaco-list-row.selected:hover { background-color: #2477ce; }
.monaco-list.list_id_2:focus .monaco-list-row.selected { color: #ffffff; }
.monaco-list.list_id_2:focus .monaco-list-row.selected.focused { background-color: #2477ce; }
.monaco-list.list_id_2:focus .monaco-list-row.selected.focused { color: #ffffff; }
.monaco-list.list_id_2 .monaco-list-row.focused { background-color:  #dff0ff; }
.monaco-list.list_id_2 .monaco-list-row.focused:hover { background-color:  #dff0ff; }
.monaco-list.list_id_2 .monaco-list-row.selected { background-color:  #dddfea; }
.monaco-list.list_id_2 .monaco-list-row.selected:hover { background-color:  #dddfea; }
.monaco-list.list_id_2 .monaco-list-row:hover { background-color:  #f0f0f0; }</style></div></div><div class="details" aria-hidden="true" style="font-size: 15px; display: none; background-color: rgb(239, 239, 242); border-color: rgb(200, 200, 200);"><div class="monaco-scrollable-element " role="presentation" style="position: relative; overflow: hidden;"><div class="body" style="overflow: hidden;"><div class="header"><span class="close" title="Read less... (Ctrl+Space)" style="height: 20px; width: 20px;"></span><p class="type" style="font-family: SourceCodePro, monospace;"></p></div><p class="docs"></p></div><div role="presentation" aria-hidden="true" class="invisible scrollbar horizontal" style="position: absolute;"><div class="slider" style="position: absolute; top: 0px; left: 0px; height: 10px; will-change: transform;"></div></div><div role="presentation" aria-hidden="true" class="invisible scrollbar vertical" style="position: absolute;"><div class="slider" style="position: absolute; top: 0px; left: 0px; width: 10px; will-change: transform;"></div></div><div class="shadow"></div><div class="shadow"></div><div class="shadow top-left-corner"></div></div></div></div></div><div class="context-view monaco-builder-hidden" aria-hidden="true"></div></div></div></div></div><div class="hr-monaco-editor-statusbar"><div class="statusbar-position">Line: 6 Col: 49</div><div style="display: flex;"><div class="statusbar-message"></div></div></div></div><div class="pmR pmL pmB plT run-code-wrapper"><button class=" pull-right btn btn-primary hr-monaco-submit">Submit Code</button><button class=" pull-right btn msR hr-monaco-compile">Run Code</button></div></div><div class="pmR pmL pmB hr-monaco-custom-input-wrapper inline"><div><button class="btn btn-text upload-file mlR" data-analytics="Upload File" type="button"><i class="icon-upload ui-icon-upload"></i>Upload Code as File</button></div><div><label><div class="custom-checkbox inline"><input type="checkbox" class="custom-input-checkbox"></div><span class="lmT msL testcase-label">Test against custom input</span></label></div></div></div></div></div><div class="challenge-response fs-container"></div></section></div><div class="right-pane"><aside class="theme-m-content fullscreen-hide challenge-sidebar"><div class="challenge-sidebar-container"><div class="sidebar-problem-difficulty challenge-sidebar-help"><div class="difficulty-block"><p class="difficulty-label">Author</p><a class="pull-right text-link" data-analytics="ChallengeViewHeaderAuthor" data-attr1="welcome-to-java" data-attr2="Shafaet" href="https://www.hackerrank.com/profile/Shafaet">Shafaet</a></div><div class="difficulty-block"><p class="difficulty-label">Difficulty</p><p class="pull-right difficulty-easy">Easy</p></div><div class="difficulty-block"><p class="difficulty-label">Max Score</p><p class="sidebar-detail pull-right">3</p></div><div class="difficulty-block"><p class="difficulty-label">Submitted By</p><a class="pull-right text-link" data-analytics="ChallengeViewHackerCount" data-attr1="welcome-to-java" href="https://www.hackerrank.com/challenges/welcome-to-java/leaderboard">709072</a></div></div><div class="challenge-sidebar-help"><h2 class="text-sec-headline-s">Need Help?</h2><hr class="hr-line-light"><div class="mlB"><div class="link-wrapper"><a data-analytics="ChallengeSidebarUI" data-attr1="discussions" data-attr2="welcome-to-java" data-attr3="master" href="https://www.hackerrank.com/challenges/welcome-to-java/forum"><i class="ui-icon-discussion ui-icon-grey sidebar-icon"></i><span class="ui-icon-label">View discussions</span></a></div><div class="link-wrapper"><a data-analytics="ChallengeSidebarUI" data-attr1="editorial" data-attr2="welcome-to-java" data-attr3="master" href="https://www.hackerrank.com/challenges/welcome-to-java/editorial"><i class="ui-icon-editorial ui-icon-grey sidebar-icon"></i><span class="ui-icon-label">View editorial</span></a></div><div class="link-wrapper"><a data-analytics="ChallengeSidebarUI" data-attr1="topscorers" data-attr2="welcome-to-java" data-attr3="master" href="https://www.hackerrank.com/challenges/welcome-to-java/leaderboard"><i class="ui-icon-trophy ui-icon-grey sidebar-icon"></i><span class="ui-icon-label">View top submissions</span></a></div></div></div><div class="challenge-rating rating"><p class="zeta rating-label">rate this challenge</p><div class="rating"><i class="rating-icon cursor ui-icon-star" data-analytics="RatedChallenge" data-attr7="1"></i><i class="rating-icon cursor ui-icon-star" data-analytics="RatedChallenge" data-attr7="2"></i><i class="rating-icon cursor ui-icon-star" data-analytics="RatedChallenge" data-attr7="3"></i><i class="rating-icon cursor ui-icon-star" data-analytics="RatedChallenge" data-attr7="4"></i><i class="rating-icon cursor ui-icon-star" data-analytics="RatedChallenge" data-attr7="5"></i></div></div><div class="challenge-sidebar-help need-help-wrapper"><div class="text-sec-headline-s">MORE DETAILS</div><hr class="hr-line-light"><div class="link-wrapper"><a target="_blank" id="pdf-link" data-analytics="ChallengeViewSidebarPDF" data-attr1="welcome-to-java" href="https://www.hackerrank.com/rest/contests/master/challenges/welcome-to-java/download_pdf?language=English"><i class="ui-icon-grey sidebar-icon ui-icon-download"></i><span class="ui-icon-label">Download problem statement</span></a></div><div class="link-wrapper"><a target="_blank" id="test-cases-link" data-analytics="ChallengeViewSidebarTestCases" data-attr1="welcome-to-java" href="https://www.hackerrank.com/rest/contests/master/challenges/welcome-to-java/download_testcases"><i class="ui-icon-grey sidebar-icon ui-icon-download"></i><span class="ui-icon-label">Download sample test cases</span></a></div><div class="link-wrapper fullscreen-hide"><a class="cursor" data-analytics="ChallengeViewSuggestEdit" data-attr1="welcome-to-java"><i class="ui-icon-grey sidebar-icon ui-icon-edit"></i><span class="ui-icon-label">Suggest Edits</span></a></div></div><div class="social-share-wrap-2"><div class="clearfix"><div class="social-links-wrapper pull-left"><a class="cursor"><i class="social-share-icon ui-icon-facebook"></i></a><a class="cursor"><i class="social-share-icon ui-icon-twitter"></i></a><a class="cursor"><i class="social-share-icon ui-icon-linkedin"></i></a></div></div></div></div></aside></div></div></div></div></section></div></div><div></div><footer class="community-footer"><ul class="footer-links"><li class="link-item"><a target="_blank" class="footer-link calendar" data-analytics="FooterLinkCalendar" href="https://www.hackerrank.com/calendar">Contest Calendar</a></li><li class="link-item"><a target="_blank" class="footer-link blog" data-analytics="FooterLinkBlog" href="https://blog.hackerrank.com/">Blog</a></li><li class="link-item"><a target="_blank" class="footer-link scoring" data-analytics="FooterLinkScoring" href="https://www.hackerrank.com/scoring">Scoring</a></li><li class="link-item"><a target="_blank" class="footer-link environment" data-analytics="FooterLinkEnvironment" href="https://www.hackerrank.com/environment">Environment</a></li><li class="link-item"><a target="_blank" class="footer-link faq" data-analytics="FooterLinkFAQ" href="https://www.hackerrank.com/faq">FAQ</a></li><li class="link-item"><a target="_blank" class="footer-link" data-analytics="FooterLinkAboutUs" href="https://www.hackerrank.com/aboutus">About Us</a></li><li class="link-item"><a target="_blank" class="footer-link" data-analytics="FooterLinkSupport" href="https://help.hackerrank.com/hc/en-us">Support</a></li><li class="link-item"><a target="_blank" class="footer-link" data-analytics="FooterLinkCareers" href="https://www.hackerrank.com/careers">Careers</a></li><li class="link-item"><a target="_blank" class="footer-link" data-analytics="FooterLinkTermsOfService" href="https://www.hackerrank.com/terms-of-service">Terms Of Service</a></li><li class="link-item"><a target="_blank" class="footer-link" data-analytics="FooterLinkPrivacyPolicy" href="https://www.hackerrank.com/privacy">Privacy Policy</a></li><li class="link-item"><a target="_blank" class="footer-link featureRequestButton" data-analytics="FooterLinkFeatureRequest" href="https://www.hackerrank.com/support/feature">Request a Feature</a></li></ul></footer></div></div></div></div><!--Required to handle event bubbling of click in ios safari -->

  <script>
    //HR namespace
    var HR = {};
    HR.development = false;
    HR.assetPath = 'https://hrcdn.net/fcore/assets/';
    HR.pageLoadTime = Date.now();
    HR.productNamespace = 'hackerrank';
    HR.production = true;
    HR.devServer = false;
    HR.isIsomorphic = true;
    HR.loadedWithOldCss = false;
    HR.pusher = {"key":"a280047e3b323ccb1b65","cluster":"mt1"};
    HR.stripe = {"key":"pk_PBXVCPHjyi31lIcbSe2mnlWEIYUzG"};
    HR.servicesBaseUrl = "https://services.hackerrank.com";
    HR.pendoAPIKey = "6a49047d-7d4c-46f5-7b81-8b6193d6bf7b\n";
  </script>

  <!-- Vendor scripts -->
  
    <script src="./prgm1_files/hackerrank_r_vendor-5a221bff30.js.download"></script>
  

  
  <script src="./prgm1_files/runtime-8c52599ae7.js.download"></script>
  <script src="./prgm1_files/hackerrank_r_client-0c639c43a6.js.download"></script>
  
<script>
  var getUser = (function() {
    var userData;
    $(window).on('initializeNewUser', function(e, user) {
      userData = user;
    });
    try{
      if (typeof userData === 'undefined') {
        userData = JSON.parse(decodeURI($('#initialUserData').html()));
        $('#initialUserData').remove();
      }
    } catch(e){
      userData = {};
      console.log('No initial User data found');
    }
    return function() {
      return userData;
    }
  })();
</script>


<!-- setting up sentry -->

  <script src="./prgm1_files/raven.min.js.download" async="" crossorigin="anonymous" id="raven"></script>
  <script>
    (function(window, queue, loaded, script, user) {

        var setupRaven = function(user) {
          var userContext = {};
          if (user && !!user.id) {
            userContext.handle = user.id;
          }
          var extraContext = {
            cdnUrl: Cookies.get("cdn_url")
          }
          if (Cookies) {
            if (HR.productNamespace === 'hackerrank') {
              extraContext.mixpanel_token = Cookies.get('hackerrank_mixpanel_token')
            } else if (HR.productNamespace === 'hackerrankx') {
              extraContext.mixpanel_token = Cookies.get('hackerrankx_mixpanel_token')
            }
          }
          if(typeof Raven !== 'undefined') {
            Raven.setUserContext(userContext);
            Raven.setExtraContext(extraContext);
          }
        }
        $(window).on('initializeNewUser', function(e, user) {
          setupRaven(user);
        });

        window.onerror = function e(message, file, lineNo, columnNo, error) {
            if (loaded) return;
            queue.push([message, file, lineNo, columnNo, error]);
        };

        window.onunhandledrejection = function e(error) {
            if (loaded) return;
            queue.push([
                error.reason,
            ]);
        };

        script.onreadystatechange = script.onload = function() {
            if (loaded) return;
            loaded = true;

            Raven.config('https://6b2d52b23d5a4dd4bc44330335327c04@sentry.io/234162', {
                release: "59f7a32c8a",
                ignoreUrls: [/cdn\.userty\.com/],
                ignoreErrors: [
                  'Error: Connection is disposed',
                  'Connection got disposed',
                  'A network error occurred',
                  'Model is disposed!',
                  'Unable to get property \'isVisible\' of undefined',
                  'Cannot read property \'isVisible\' of undefined',
                ],
            }).install();

            setupRaven(user);

            window.onunhandledrejection = function e(error) {
                Raven.captureException(error.reason, {
                    extra: {
                        type: error.type,
                    },
                });
            };

            queue.forEach(function(error) {
                Raven.captureException(error[4] || error[0], {
                    extra: {
                        file: error[1],
                        line: error[2],
                        col: error[3],
                    },
                });
            });
        };
    }(window, [], false, document.getElementById('raven'), getUser()));
 </script>


<!-- Mixpanel Stub -->
<script type="text/javascript">
  window.mixpanel = window.mixpanel || [];
  var attrs = "disable track track_pageview track_links track_forms register register_once alias unregister identify name_tag set_config people.set people.set_once people.increment people.append people.track_charge people.clear_charges people.delete_user".split(" ");
  for (var attribute in attrs) {
    mixpanel[attrs[attribute]] = function () {};
  }
</script>

<!-- google analytics tracking -->
<script>
  var _gaq = _gaq || [];
  
</script>
<!-- Pending candidate site custom GA code -->
<!-- google analytics tracking end-->


<!-- auryc tracking start -->
<script type="text/javascript">
  
    function aurycProps(user) {
      if (user && user.company && HR.productNamespace === 'hackerrankx') {

        userProps = {
          user_role: user.role,
          company_id: user.company.id,
          plan_name: user.company.plan_name
        }
      } else if (HR.productNamespace === 'hackerrank') {
        userProps = {
          user_id: user.id,
        };
      } else {
        userProps = {};
      }
      return userProps;
    }

    function setupAurycProps(aurycId, user) {
      userProps = aurycProps(user);
      window.auryc.identify(aurycId);
      window.auryc.addUserProperties(userProps);
      window.auryc.setFeedbackEnabled(!!user.enable_nps_survey);
      window.auryc.addSessionProperties({productNamespace: HR.productNamespace});
    }

    setupAuryc = function(user) {
      hackerrankxAurycSrc = "//cdn.userty.com/207-hackerrankcom/container.js";
      hackerrankAurycSrc = "//cdn.userty.com/531-hackerrankCommunity/container.js";
      if(HR.productNamespace === 'hackerrankx') {
        if (!(user && user.id) || !!Cookies.get('admin_su') || user.disable_auryc) return;
        src = hackerrankxAurycSrc;
        aurycId = user.id.toString();
      } else {
        return
      }

      ;(function (g) { g.aurycReadyCb = g.aurycReadyCb || []; var d = document, i, am = d.createElement("script"), h = d.head || d.getElementsByTagName("head")[0],aex = { "src": src, "data-cfasync": "false", "async": "true", "defer": "true", "data-vendor": "userty", "data-role": "container", "charset": "utf-8" }; for (var attr in aex) { am.setAttribute(attr,aex[attr]); } h.appendChild(am); })(window);

      if (window.auryc) {
        setupAurycProps(aurycId, user)
      } else if (window.aurycReadyCb) {
        window.aurycReadyCb.push(function() {
          setupAurycProps(aurycId, user)
        })
      }
    }

    setupAuryc(getUser());
    $(window).on('initializeNewUser', function(e, user) {
      setupAuryc(user);
    });
  
</script>
<!-- auryc tracking end -->

<!-- Pendo Tracking   -->

  <script type="text/javascript">
    if (window.HR && window.HR.pendoAPIKey) {
    (function(apiKey){
        (function(p,e,n,d,o){var v,w,x,y,z;o=p[d]=p[d]||{};o._q=[];
        v=['initialize','identify','updateOptions','pageLoad'];for(w=0,x=v.length;w<x;++w)(function(m){
            o[m]=o[m]||function(){o._q[m===v[0]?'unshift':'push']([m].concat([].slice.call(arguments,0)));};})(v[w]);
            y=e.createElement(n);y.async=!0;y.src='https://cdn.pendo.io/agent/static/'+apiKey+'/pendo.js';
            z=e.getElementsByTagName(n)[0];z.parentNode.insertBefore(y,z);})(window,document,'script','pendo');
    })(window.HR.pendoAPIKey);

    var pendoTracking = function(user){
      
    }
    pendoTracking(getUser());
  }
  </script>

<!-- Pendo Tracking end -->

<!-- GTM tracking -->

<script type="text/javascript">
  var gtmTracking = function (user){
    if (window.dataLayer) {
      

      
        window.dataLayer.push({'event': 'setUserProps', 'userProps': {
          level: user.level,
          badges_onboarding_status: user.badges_onboarding_status,
          sourcing_jobs_consent: user.sourcing_jobs_consent
        }});
      
    }
  }
  gtmTracking(getUser());
  $(window).on('initializeNewUser', function(e, user) {
    gtmTracking(user);
  });

</script>

<!-- GTM tracking end -->


<!-- Google Tag Manager (noscript) #1 -->
<noscript><iframe src="https://www.googletagmanager.com/ns.html?id=GTM-NZTBQVZ"
height="0" width="0" style="display:none;visibility:hidden"></iframe></noscript>
<!-- End Google Tag Manager (noscript) #1 -->


<!-- Marketo to be added later -->



<!-- Bizible -->

<!-- HR metrics init -->
<script type="text/javascript">

  (function() {
    hr_metrics.init({
      product: 'hackerrank',
      use_cookie: true,
      uid_cookie_key: 'hackerrank_mixpanel_token',
      uid_token_cookie_key: 'metrics_user_identifier',
      session_cookie_key: 'session_id',
      metrics_endpoint:  'https://metrics.hackerrank.com/metrics' 
    });
  })();

  (function(h) {
    window.hr_metrics = h;
    if (!h.loaded) {
      var a = ['track', 'batch_track', 'app_track', 'externalService', 'init', 'batch_track_record', 'track_dwell_time', 'set_navigation_data'];
      for (var i = 0; i < a.length; i++) {
        if (!h[a[i]]) {h[a[i]] = function() {};}
      }
    }
  })(window.hr_metrics || {});



</script>

<!-- hrutm_params -->

<!-- HR metrics extension pack -->
<script type="text/javascript">

  
    if (('performance' in window) && ('timing' in window.performance)) {
      $(window).on("load", function() {
        setTimeout(function(){
          var timing = window.performance.timing;
          var obj = {
            referring_url: window.location.pathname,
            fullLoadTime: timing.loadEventEnd - timing.navigationStart,
            // Total time from req start to load
            loadTime: timing.loadEventEnd - timing.fetchStart,
            // Time spent constructing the DOM tree
            domReadyTime: timing.domComplete - timing.domInteractive,
            // Time consumed preparing the new page
            readyStart: timing.fetchStart - timing.navigationStart,
            // Time spent during redirection
            redirectTime: timing.redirectEnd - timing.redirectStart,
            // AppCache
            appcacheTime: timing.domainLookupStart - timing.fetchStart,
            // Time spent unloading documents
            unloadEventTime: timing.unloadEventEnd - timing.unloadEventStart,
            // DNS query time
            lookupDomainTime: timing.domainLookupEnd - timing.domainLookupStart,
            // TCP connection time
            connectTime: timing.connectEnd - timing.connectStart,
            // Time spent during the request
            requestTime: timing.responseEnd - timing.requestStart,
            // Request to completion of the DOM loading
            initDomTreeTime: timing.domInteractive - timing.responseEnd,
            // Load event time
            loadEventTime: timing.loadEventEnd - timing.loadEventStart,
            // Origin of the request
            react: true,
            //isIsomorphic flag
            isIsomorphic: window.HR.isIsomorphic,
            //old css loaded flag
            loadedWithOldCss: window.HR.loadedWithOldCss,
          }

          if (('navigation' in window.performance) && ('getEntries' in window.performance)) {
            obj.navigationType = window.performance.navigation.type;
            obj.navigationRedirectCount = window.performance.navigation.redirectCount;
            if (obj.fullLoadTime > 8000) {
              try {
                var entries = window.performance.getEntries();
                if(entries[0].toJSON){
                  obj.networkRequests = entries.map(function(e) {return e.toJSON();});
                }
              } catch (e) {
                //do nothing
              }
            }
          }

          hr_metrics.app_track('page-load-metrics', obj);
        }, 1000);
      });
    }
  

  $(window).on("load", function() {
      var _pathname = document.location.pathname;
      var cdn_url_switched = Cookies.get("cdn_url_switched");
      if (cdn_url_switched !== '') {
        Cookies.remove('cdn_url_switched');
      }
      hr_metrics.batch_track('PageLoad', _pathname + document.location.search, {
          attribute1: _pathname,
          attribute6: cdn_url_switched,
          cdn_url: Cookies.get("cdn_url")
      });

      if (hr_metrics.track_dwell_time) {
          hr_metrics.track_dwell_time(_pathname);
          hr_metrics.set_navigation_data();
      }

      $(window).on('beforeunload', function(){

          var _pathname = document.location.pathname;
          hr_metrics.batch_track('PageClose', _pathname + document.location.search, {
              attribute2: _pathname
          });

          hr_metrics.track_dwell_time(_pathname, true);

          hr_metrics.batch_track_record(true);
      });

  });

</script>

<!-- Facebook SDK -->
<!-- Twitter SDK -->

<!-- track button clicks -->
<script>
    $(document).on('click', 'a, button, input, select, i, div, span, h5', null, function(e) {
        var src = e.currentTarget, $src = $(e.currentTarget);
        if ($src.attr('data-analytics')) {
            action = 'Click'; data = $src.attr('data-analytics');
        } else {
            return;
        }

        
          hr_metrics.batch_track(action, data, (function() {
              var params={};
              for (var _i=1; _i<=12; ++_i){
                  var _attr = 'data-attr'+_i;
                  if ($src.attr(_attr)){
                    params['attribute'+_i] = $src.attr(_attr);
                  }
              }
              var attributes = src.attributes, attr_length = src.attributes.length;
              for (var i = 0; i < attr_length; i++){
                var attribute = attributes[i];
                if (attribute.name.indexOf('data-attr-') === 0){
                  param_name = attribute.name.substr('data-attr-'.length);
                  if (param_name.length > 0) {
                    params[param_name] = attribute.value;
                  }
                }
              }
              return params;
          })());
        

        
    });

    $(document).on('AnalyticsEvent', function(e) {
        action = e.event_type || false;
        data = e.event_name || false;

        if (!action || !data) {
          return;
        }

        params = {}
        params['attribute1'] = e.event_value || ""
        params['attribute7'] = e.integer_event_value

        if (window.HR && window.HR.current_page) {
          params['attribute2'] = window.HR.current_page;
        }

        if (window.HR && window.HR.current_contest) {
          params['attribute3'] = window.HR.current_contest.get('name');
        }

        
            hr_metrics.batch_track(action, data, params);
        

        
    });

  </script>
<!-- track button clicks end-->

<!-- Linkedin Insights -->




<script type="text/javascript" id="">function debounce(b,f,c){var a;return function(){var d=this,e=arguments,g=function(){a=null;c||b.apply(d,e)},h=c&&!a;clearTimeout(a);a=setTimeout(g,f);h&&b.apply(d,e)}}(function(){document.addEventListener("click",debounce(google_tag_manager["GTM-NLXX3SZ"].macro(14),500,!0),!0);document.addEventListener("mouseenter",debounce(google_tag_manager["GTM-NLXX3SZ"].macro(23),1E3),!0);window.jsTrackGoogleAnalytics&&"function"!==typeof window.jsTrackGoogleAnalytics||(window.jsTrackGoogleAnalytics=google_tag_manager["GTM-NLXX3SZ"].macro(26))})();</script><script type="text/javascript" id="">Element.prototype.matches||(Element.prototype.matches=Element.prototype.msMatchesSelector||Element.prototype.webkitMatchesSelector);"function"!=typeof Object.assign&&Object.defineProperty(Object,"assign",{value:function(d,f){if(null==d)throw new TypeError("Cannot convert undefined or null to object");for(var e=Object(d),b=1;b<arguments.length;b++){var a=arguments[b];if(null!=a)for(var c in a)Object.prototype.hasOwnProperty.call(a,c)&&(e[c]=a[c])}return e},writable:!0,configurable:!0});</script><div class="monaco-aria-container"><div class="monaco-alert" role="alert" aria-atomic="true"></div><div class="monaco-status" role="status" aria-atomic="true"></div></div></body></html>