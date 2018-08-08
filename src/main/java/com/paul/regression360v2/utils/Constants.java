package com.paul.regression360v2.utils;

public class Constants {
	
	public final static String REMOTE_URL = "ssh://i329046@git.wdf.sap.corp:29418";
	
	public final static String REPO_NAME = "hana_epm_fpa";
	
	public final static String TEMP_DIR = System.getProperty("java.io.tmpdir");
	
	public final static String TEMP_DIR_1 = "C:/Users/I329046/Documents/My Drive";
	
	public final static String JIRA_BASE_URL = "https://sapjira.wdf.sap.corp:443/rest/api/2/issue";
	
	public final static String JIRA_BASE_URL_MULTPLE_ISSUSES = "https://sapjira.wdf.sap.corp:443/rest/api/2/search?jql=IssueKey in";
	
	public final static String JIRA_MULTIPLE_ISSUES_SAMPLE_JSON = "{\r\n" + 
			"    \"expand\": \"schema,names\",\r\n" + 
			"    \"startAt\": 0,\r\n" + 
			"    \"maxResults\": 50,\r\n" + 
			"    \"total\": 2,\r\n" + 
			"    \"issues\": [\r\n" + 
			"        {\r\n" + 
			"            \"expand\": \"operations,versionedRepresentations,editmeta,changelog,renderedFields\",\r\n" + 
			"            \"id\": \"4833723\",\r\n" + 
			"            \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/issue/4833723\",\r\n" + 
			"            \"key\": \"FPA51-2496\",\r\n" + 
			"            \"fields\": {\r\n" + 
			"                \"customfield_17142\": null,\r\n" + 
			"                \"customfield_19442\": null,\r\n" + 
			"                \"customfield_17141\": null,\r\n" + 
			"                \"customfield_19443\": null,\r\n" + 
			"                \"parent\": {\r\n" + 
			"                    \"id\": \"4833672\",\r\n" + 
			"                    \"key\": \"FPA51-2489\",\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/issue/4833672\",\r\n" + 
			"                    \"fields\": {\r\n" + 
			"                        \"summary\": \"Story Container Work\",\r\n" + 
			"                        \"status\": {\r\n" + 
			"                            \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/status/10176\",\r\n" + 
			"                            \"description\": \"This status is managed internally by JIRA Software\",\r\n" + 
			"                            \"iconUrl\": \"https://sapjira.wdf.sap.corp/images/icons/subtask.gif\",\r\n" + 
			"                            \"name\": \"Development in Progress\",\r\n" + 
			"                            \"id\": \"10176\",\r\n" + 
			"                            \"statusCategory\": {\r\n" + 
			"                                \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/statuscategory/4\",\r\n" + 
			"                                \"id\": 4,\r\n" + 
			"                                \"key\": \"indeterminate\",\r\n" + 
			"                                \"colorName\": \"yellow\",\r\n" + 
			"                                \"name\": \"In Progress\"\r\n" + 
			"                            }\r\n" + 
			"                        },\r\n" + 
			"                        \"priority\": {\r\n" + 
			"                            \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/priority/3\",\r\n" + 
			"                            \"iconUrl\": \"https://sapjira.wdf.sap.corp/images/icons/priorities/major.svg\",\r\n" + 
			"                            \"name\": \"Medium\",\r\n" + 
			"                            \"id\": \"3\"\r\n" + 
			"                        },\r\n" + 
			"                        \"issuetype\": {\r\n" + 
			"                            \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/issuetype/6\",\r\n" + 
			"                            \"id\": \"6\",\r\n" + 
			"                            \"description\": \"Backlog Item\",\r\n" + 
			"                            \"iconUrl\": \"https://sapjira.wdf.sap.corp/images/icons/issuetypes/requirement.png\",\r\n" + 
			"                            \"name\": \"Backlog Item\",\r\n" + 
			"                            \"subtask\": false\r\n" + 
			"                        }\r\n" + 
			"                    }\r\n" + 
			"                },\r\n" + 
			"                \"customfield_17140\": null,\r\n" + 
			"                \"customfield_10070\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/customFieldOption/10021\",\r\n" + 
			"                    \"value\": \"No\",\r\n" + 
			"                    \"id\": \"10021\"\r\n" + 
			"                },\r\n" + 
			"                \"customfield_17146\": null,\r\n" + 
			"                \"customfield_10071\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/customFieldOption/10023\",\r\n" + 
			"                    \"value\": \"No\",\r\n" + 
			"                    \"id\": \"10023\"\r\n" + 
			"                },\r\n" + 
			"                \"customfield_17145\": null,\r\n" + 
			"                \"customfield_13340\": null,\r\n" + 
			"                \"customfield_17144\": null,\r\n" + 
			"                \"customfield_19440\": null,\r\n" + 
			"                \"customfield_17143\": null,\r\n" + 
			"                \"customfield_19441\": null,\r\n" + 
			"                \"customfield_15246\": null,\r\n" + 
			"                \"customfield_11441\": null,\r\n" + 
			"                \"customfield_15640\": null,\r\n" + 
			"                \"fixVersions\": [\r\n" + 
			"                    {\r\n" + 
			"                        \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/version/177459\",\r\n" + 
			"                        \"id\": \"177459\",\r\n" + 
			"                        \"description\": \"\",\r\n" + 
			"                        \"name\": \"2018.12\",\r\n" + 
			"                        \"archived\": false,\r\n" + 
			"                        \"released\": false\r\n" + 
			"                    }\r\n" + 
			"                ],\r\n" + 
			"                \"customfield_11440\": null,\r\n" + 
			"                \"customfield_10111\": null,\r\n" + 
			"                \"resolution\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/resolution/10000\",\r\n" + 
			"                    \"id\": \"10000\",\r\n" + 
			"                    \"description\": \"GreenHopper Managed Resolution\",\r\n" + 
			"                    \"name\": \"Done\"\r\n" + 
			"                },\r\n" + 
			"                \"customfield_19040\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/customFieldOption/31061\",\r\n" + 
			"                    \"value\": \"No\",\r\n" + 
			"                    \"id\": \"31061\"\r\n" + 
			"                },\r\n" + 
			"                \"customfield_19041\": null,\r\n" + 
			"                \"customfield_16041\": null,\r\n" + 
			"                \"lastViewed\": null,\r\n" + 
			"                \"customfield_16040\": null,\r\n" + 
			"                \"customfield_10180\": null,\r\n" + 
			"                \"customfield_16442\": null,\r\n" + 
			"                \"customfield_10060\": null,\r\n" + 
			"                \"customfield_16045\": null,\r\n" + 
			"                \"customfield_10061\": \"2018-05-02\",\r\n" + 
			"                \"customfield_16044\": null,\r\n" + 
			"                \"customfield_18341\": null,\r\n" + 
			"                \"customfield_16842\": null,\r\n" + 
			"                \"customfield_16841\": null,\r\n" + 
			"                \"customfield_10340\": \"9223372036854775807\",\r\n" + 
			"                \"customfield_16444\": null,\r\n" + 
			"                \"customfield_16840\": null,\r\n" + 
			"                \"customfield_18748\": \"Add any other requirements for the API that you might have, e.g. performance expectations: do you want the API to handle batch input? What is the latency you expect?\",\r\n" + 
			"                \"customfield_10220\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/customFieldOption/10140\",\r\n" + 
			"                    \"value\": \"default\",\r\n" + 
			"                    \"id\": \"10140\"\r\n" + 
			"                },\r\n" + 
			"                \"customfield_16443\": null,\r\n" + 
			"                \"priority\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/priority/3\",\r\n" + 
			"                    \"iconUrl\": \"https://sapjira.wdf.sap.corp/images/icons/priorities/major.svg\",\r\n" + 
			"                    \"name\": \"Medium\",\r\n" + 
			"                    \"id\": \"3\"\r\n" + 
			"                },\r\n" + 
			"                \"customfield_10221\": null,\r\n" + 
			"                \"customfield_10861\": null,\r\n" + 
			"                \"labels\": [],\r\n" + 
			"                \"customfield_14941\": null,\r\n" + 
			"                \"customfield_10852\": null,\r\n" + 
			"                \"customfield_10853\": null,\r\n" + 
			"                \"customfield_10854\": null,\r\n" + 
			"                \"customfield_10855\": null,\r\n" + 
			"                \"customfield_10856\": null,\r\n" + 
			"                \"aggregatetimeoriginalestimate\": null,\r\n" + 
			"                \"timeestimate\": null,\r\n" + 
			"                \"versions\": [],\r\n" + 
			"                \"issuelinks\": [],\r\n" + 
			"                \"assignee\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/user?username=i863077\",\r\n" + 
			"                    \"name\": \"i863077\",\r\n" + 
			"                    \"key\": \"i863077\",\r\n" + 
			"                    \"emailAddress\": \"bertrand.wong@sap.com\",\r\n" + 
			"                    \"avatarUrls\": {\r\n" + 
			"                        \"48x48\": \"https://sapjira.wdf.sap.corp/secure/useravatar?avatarId=10428\",\r\n" + 
			"                        \"24x24\": \"https://sapjira.wdf.sap.corp/secure/useravatar?size=small&avatarId=10428\",\r\n" + 
			"                        \"16x16\": \"https://sapjira.wdf.sap.corp/secure/useravatar?size=xsmall&avatarId=10428\",\r\n" + 
			"                        \"32x32\": \"https://sapjira.wdf.sap.corp/secure/useravatar?size=medium&avatarId=10428\"\r\n" + 
			"                    },\r\n" + 
			"                    \"displayName\": \"Wong, Bertrand(I863077)\",\r\n" + 
			"                    \"active\": true,\r\n" + 
			"                    \"timeZone\": \"America/Vancouver\"\r\n" + 
			"                },\r\n" + 
			"                \"status\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/status/10003\",\r\n" + 
			"                    \"description\": \"The Task is considered finished. Tasks which are closed can be reopened.\",\r\n" + 
			"                    \"iconUrl\": \"https://sapjira.wdf.sap.corp/images/icons/statuses/closed.png\",\r\n" + 
			"                    \"name\": \"Done\",\r\n" + 
			"                    \"id\": \"10003\",\r\n" + 
			"                    \"statusCategory\": {\r\n" + 
			"                        \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/statuscategory/3\",\r\n" + 
			"                        \"id\": 3,\r\n" + 
			"                        \"key\": \"done\",\r\n" + 
			"                        \"colorName\": \"green\",\r\n" + 
			"                        \"name\": \"Done\"\r\n" + 
			"                    }\r\n" + 
			"                },\r\n" + 
			"                \"components\": [],\r\n" + 
			"                \"customfield_10290\": null,\r\n" + 
			"                \"customfield_10291\": null,\r\n" + 
			"                \"customfield_15340\": null,\r\n" + 
			"                \"customfield_15741\": null,\r\n" + 
			"                \"customfield_11540\": null,\r\n" + 
			"                \"customfield_10210\": \"9223372036854775807\",\r\n" + 
			"                \"customfield_10850\": null,\r\n" + 
			"                \"customfield_10851\": null,\r\n" + 
			"                \"customfield_10842\": null,\r\n" + 
			"                \"customfield_10843\": null,\r\n" + 
			"                \"customfield_10844\": null,\r\n" + 
			"                \"customfield_10845\": null,\r\n" + 
			"                \"aggregatetimeestimate\": null,\r\n" + 
			"                \"customfield_10846\": null,\r\n" + 
			"                \"customfield_10847\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/customFieldOption/10960\",\r\n" + 
			"                    \"value\": \"Internal\",\r\n" + 
			"                    \"id\": \"10960\"\r\n" + 
			"                },\r\n" + 
			"                \"customfield_10848\": null,\r\n" + 
			"                \"customfield_10849\": null,\r\n" + 
			"                \"customfield_19140\": null,\r\n" + 
			"                \"customfield_16141\": null,\r\n" + 
			"                \"customfield_16140\": null,\r\n" + 
			"                \"customfield_18442\": null,\r\n" + 
			"                \"creator\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/user?username=i819741\",\r\n" + 
			"                    \"name\": \"i819741\",\r\n" + 
			"                    \"key\": \"i819741\",\r\n" + 
			"                    \"emailAddress\": \"lyndon.hiew@sap.com\",\r\n" + 
			"                    \"avatarUrls\": {\r\n" + 
			"                        \"48x48\": \"https://sapjira.wdf.sap.corp/secure/useravatar?avatarId=10432\",\r\n" + 
			"                        \"24x24\": \"https://sapjira.wdf.sap.corp/secure/useravatar?size=small&avatarId=10432\",\r\n" + 
			"                        \"16x16\": \"https://sapjira.wdf.sap.corp/secure/useravatar?size=xsmall&avatarId=10432\",\r\n" + 
			"                        \"32x32\": \"https://sapjira.wdf.sap.corp/secure/useravatar?size=medium&avatarId=10432\"\r\n" + 
			"                    },\r\n" + 
			"                    \"displayName\": \"Hiew, Lyndon (i819741)\",\r\n" + 
			"                    \"active\": true,\r\n" + 
			"                    \"timeZone\": \"America/Vancouver\"\r\n" + 
			"                },\r\n" + 
			"                \"customfield_18840\": null,\r\n" + 
			"                \"subtasks\": [],\r\n" + 
			"                \"customfield_10161\": null,\r\n" + 
			"                \"customfield_16941\": null,\r\n" + 
			"                \"customfield_16940\": null,\r\n" + 
			"                \"reporter\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/user?username=i819741\",\r\n" + 
			"                    \"name\": \"i819741\",\r\n" + 
			"                    \"key\": \"i819741\",\r\n" + 
			"                    \"emailAddress\": \"lyndon.hiew@sap.com\",\r\n" + 
			"                    \"avatarUrls\": {\r\n" + 
			"                        \"48x48\": \"https://sapjira.wdf.sap.corp/secure/useravatar?avatarId=10432\",\r\n" + 
			"                        \"24x24\": \"https://sapjira.wdf.sap.corp/secure/useravatar?size=small&avatarId=10432\",\r\n" + 
			"                        \"16x16\": \"https://sapjira.wdf.sap.corp/secure/useravatar?size=xsmall&avatarId=10432\",\r\n" + 
			"                        \"32x32\": \"https://sapjira.wdf.sap.corp/secure/useravatar?size=medium&avatarId=10432\"\r\n" + 
			"                    },\r\n" + 
			"                    \"displayName\": \"Hiew, Lyndon (i819741)\",\r\n" + 
			"                    \"active\": true,\r\n" + 
			"                    \"timeZone\": \"America/Vancouver\"\r\n" + 
			"                },\r\n" + 
			"                \"aggregateprogress\": {\r\n" + 
			"                    \"progress\": 0,\r\n" + 
			"                    \"total\": 0\r\n" + 
			"                },\r\n" + 
			"                \"customfield_12740\": null,\r\n" + 
			"                \"customfield_10038\": null,\r\n" + 
			"                \"customfield_15848\": null,\r\n" + 
			"                \"customfield_10039\": \"false\",\r\n" + 
			"                \"customfield_15846\": null,\r\n" + 
			"                \"customfield_15847\": null,\r\n" + 
			"                \"progress\": {\r\n" + 
			"                    \"progress\": 0,\r\n" + 
			"                    \"total\": 0\r\n" + 
			"                },\r\n" + 
			"                \"votes\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/issue/FPA51-2496/votes\",\r\n" + 
			"                    \"votes\": 0,\r\n" + 
			"                    \"hasVoted\": false\r\n" + 
			"                },\r\n" + 
			"                \"issuetype\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/issuetype/5\",\r\n" + 
			"                    \"id\": \"5\",\r\n" + 
			"                    \"description\": \"Task\",\r\n" + 
			"                    \"iconUrl\": \"https://sapjira.wdf.sap.corp/secure/viewavatar?size=xsmall&avatarId=27826&avatarType=issuetype\",\r\n" + 
			"                    \"name\": \"Task\",\r\n" + 
			"                    \"subtask\": true,\r\n" + 
			"                    \"avatarId\": 27826\r\n" + 
			"                },\r\n" + 
			"                \"customfield_15440\": null,\r\n" + 
			"                \"customfield_15441\": null,\r\n" + 
			"                \"customfield_10270\": \"9223372036854775807\",\r\n" + 
			"                \"timespent\": null,\r\n" + 
			"                \"customfield_10150\": null,\r\n" + 
			"                \"customfield_10271\": \"9223372036854775807\",\r\n" + 
			"                \"customfield_15841\": null,\r\n" + 
			"                \"project\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/project/44483\",\r\n" + 
			"                    \"id\": \"44483\",\r\n" + 
			"                    \"key\": \"FPA51\",\r\n" + 
			"                    \"name\": \"FPA51 - Threshold & Viz (Henry Lo) - AREA51\",\r\n" + 
			"                    \"avatarUrls\": {\r\n" + 
			"                        \"48x48\": \"https://sapjira.wdf.sap.corp/secure/projectavatar?pid=44483&avatarId=41158\",\r\n" + 
			"                        \"24x24\": \"https://sapjira.wdf.sap.corp/secure/projectavatar?size=small&pid=44483&avatarId=41158\",\r\n" + 
			"                        \"16x16\": \"https://sapjira.wdf.sap.corp/secure/projectavatar?size=xsmall&pid=44483&avatarId=41158\",\r\n" + 
			"                        \"32x32\": \"https://sapjira.wdf.sap.corp/secure/projectavatar?size=medium&pid=44483&avatarId=41158\"\r\n" + 
			"                    }\r\n" + 
			"                },\r\n" + 
			"                \"customfield_15844\": null,\r\n" + 
			"                \"aggregatetimespent\": null,\r\n" + 
			"                \"customfield_11640\": null,\r\n" + 
			"                \"customfield_15845\": null,\r\n" + 
			"                \"customfield_10036\": null,\r\n" + 
			"                \"customfield_10037\": null,\r\n" + 
			"                \"customfield_15843\": null,\r\n" + 
			"                \"customfield_10941\": null,\r\n" + 
			"                \"customfield_10942\": null,\r\n" + 
			"                \"customfield_10943\": null,\r\n" + 
			"                \"customfield_10944\": null,\r\n" + 
			"                \"customfield_10945\": null,\r\n" + 
			"                \"customfield_10946\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/customFieldOption/11185\",\r\n" + 
			"                    \"value\": \"Not Set\",\r\n" + 
			"                    \"id\": \"11185\"\r\n" + 
			"                },\r\n" + 
			"                \"resolutiondate\": \"2018-06-01T21:35:45.000+0000\",\r\n" + 
			"                \"customfield_10947\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/customFieldOption/11190\",\r\n" + 
			"                    \"value\": \"Yes\",\r\n" + 
			"                    \"id\": \"11190\"\r\n" + 
			"                },\r\n" + 
			"                \"customfield_10948\": null,\r\n" + 
			"                \"workratio\": -1,\r\n" + 
			"                \"customfield_16240\": null,\r\n" + 
			"                \"watches\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/issue/FPA51-2496/watchers\",\r\n" + 
			"                    \"watchCount\": 1,\r\n" + 
			"                    \"isWatching\": false\r\n" + 
			"                },\r\n" + 
			"                \"customfield_16640\": null,\r\n" + 
			"                \"created\": \"2018-05-02T21:20:42.000+0000\",\r\n" + 
			"                \"customfield_16241\": null,\r\n" + 
			"                \"customfield_18947\": null,\r\n" + 
			"                \"customfield_10300\": null,\r\n" + 
			"                \"updated\": \"2018-06-01T21:35:45.000+0000\",\r\n" + 
			"                \"customfield_15140\": null,\r\n" + 
			"                \"customfield_19740\": null,\r\n" + 
			"                \"customfield_15144\": \"1|hz1ulr:\",\r\n" + 
			"                \"timeoriginalestimate\": null,\r\n" + 
			"                \"customfield_11340\": null,\r\n" + 
			"                \"description\": null,\r\n" + 
			"                \"customfield_10130\": \"2018-05-02\",\r\n" + 
			"                \"customfield_15940\": null,\r\n" + 
			"                \"customfield_10013\": null,\r\n" + 
			"                \"customfield_10005\": null,\r\n" + 
			"                \"customfield_10248\": null,\r\n" + 
			"                \"summary\": \"Switching from translated to source language\",\r\n" + 
			"                \"customfield_12140\": null,\r\n" + 
			"                \"customfield_16340\": null,\r\n" + 
			"                \"customfield_10120\": null,\r\n" + 
			"                \"customfield_10241\": null,\r\n" + 
			"                \"customfield_16740\": null,\r\n" + 
			"                \"customfield_10003\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/customFieldOption/10010\",\r\n" + 
			"                    \"value\": \"Yes\",\r\n" + 
			"                    \"id\": \"10010\"\r\n" + 
			"                },\r\n" + 
			"                \"environment\": null,\r\n" + 
			"                \"duedate\": null\r\n" + 
			"            }\r\n" + 
			"        },\r\n" + 
			"        {\r\n" + 
			"            \"expand\": \"operations,versionedRepresentations,editmeta,changelog,renderedFields\",\r\n" + 
			"            \"id\": \"4901804\",\r\n" + 
			"            \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/issue/4901804\",\r\n" + 
			"            \"key\": \"FPA46-436\",\r\n" + 
			"            \"fields\": {\r\n" + 
			"                \"customfield_17142\": null,\r\n" + 
			"                \"customfield_19442\": null,\r\n" + 
			"                \"customfield_17141\": null,\r\n" + 
			"                \"customfield_19443\": null,\r\n" + 
			"                \"parent\": {\r\n" + 
			"                    \"id\": \"4757734\",\r\n" + 
			"                    \"key\": \"FPA46-225\",\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/issue/4757734\",\r\n" + 
			"                    \"fields\": {\r\n" + 
			"                        \"summary\": \"[VIZ] [Pilot] Axis Break\",\r\n" + 
			"                        \"status\": {\r\n" + 
			"                            \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/status/10176\",\r\n" + 
			"                            \"description\": \"This status is managed internally by JIRA Software\",\r\n" + 
			"                            \"iconUrl\": \"https://sapjira.wdf.sap.corp/images/icons/subtask.gif\",\r\n" + 
			"                            \"name\": \"Development in Progress\",\r\n" + 
			"                            \"id\": \"10176\",\r\n" + 
			"                            \"statusCategory\": {\r\n" + 
			"                                \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/statuscategory/4\",\r\n" + 
			"                                \"id\": 4,\r\n" + 
			"                                \"key\": \"indeterminate\",\r\n" + 
			"                                \"colorName\": \"yellow\",\r\n" + 
			"                                \"name\": \"In Progress\"\r\n" + 
			"                            }\r\n" + 
			"                        },\r\n" + 
			"                        \"priority\": {\r\n" + 
			"                            \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/priority/3\",\r\n" + 
			"                            \"iconUrl\": \"https://sapjira.wdf.sap.corp/images/icons/priorities/major.svg\",\r\n" + 
			"                            \"name\": \"Medium\",\r\n" + 
			"                            \"id\": \"3\"\r\n" + 
			"                        },\r\n" + 
			"                        \"issuetype\": {\r\n" + 
			"                            \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/issuetype/11\",\r\n" + 
			"                            \"id\": \"11\",\r\n" + 
			"                            \"description\": \"gh.issue.story.desc\",\r\n" + 
			"                            \"iconUrl\": \"https://sapjira.wdf.sap.corp/secure/viewavatar?size=xsmall&avatarId=27824&avatarType=issuetype\",\r\n" + 
			"                            \"name\": \"User Story\",\r\n" + 
			"                            \"subtask\": false,\r\n" + 
			"                            \"avatarId\": 27824\r\n" + 
			"                        }\r\n" + 
			"                    }\r\n" + 
			"                },\r\n" + 
			"                \"customfield_17140\": null,\r\n" + 
			"                \"customfield_10070\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/customFieldOption/10021\",\r\n" + 
			"                    \"value\": \"No\",\r\n" + 
			"                    \"id\": \"10021\"\r\n" + 
			"                },\r\n" + 
			"                \"customfield_17146\": null,\r\n" + 
			"                \"customfield_10071\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/customFieldOption/10023\",\r\n" + 
			"                    \"value\": \"No\",\r\n" + 
			"                    \"id\": \"10023\"\r\n" + 
			"                },\r\n" + 
			"                \"customfield_17145\": null,\r\n" + 
			"                \"customfield_13340\": null,\r\n" + 
			"                \"customfield_17144\": null,\r\n" + 
			"                \"customfield_19440\": null,\r\n" + 
			"                \"customfield_17143\": null,\r\n" + 
			"                \"customfield_19441\": null,\r\n" + 
			"                \"customfield_15246\": null,\r\n" + 
			"                \"customfield_11441\": null,\r\n" + 
			"                \"customfield_15640\": null,\r\n" + 
			"                \"fixVersions\": [\r\n" + 
			"                    {\r\n" + 
			"                        \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/version/177373\",\r\n" + 
			"                        \"id\": \"177373\",\r\n" + 
			"                        \"description\": \"\",\r\n" + 
			"                        \"name\": \"2018.11\",\r\n" + 
			"                        \"archived\": false,\r\n" + 
			"                        \"released\": false\r\n" + 
			"                    }\r\n" + 
			"                ],\r\n" + 
			"                \"customfield_11440\": null,\r\n" + 
			"                \"customfield_10111\": null,\r\n" + 
			"                \"resolution\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/resolution/10000\",\r\n" + 
			"                    \"id\": \"10000\",\r\n" + 
			"                    \"description\": \"GreenHopper Managed Resolution\",\r\n" + 
			"                    \"name\": \"Done\"\r\n" + 
			"                },\r\n" + 
			"                \"customfield_19040\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/customFieldOption/31061\",\r\n" + 
			"                    \"value\": \"No\",\r\n" + 
			"                    \"id\": \"31061\"\r\n" + 
			"                },\r\n" + 
			"                \"customfield_19041\": null,\r\n" + 
			"                \"customfield_16041\": null,\r\n" + 
			"                \"lastViewed\": null,\r\n" + 
			"                \"customfield_16040\": null,\r\n" + 
			"                \"customfield_10180\": null,\r\n" + 
			"                \"customfield_16442\": null,\r\n" + 
			"                \"customfield_10060\": null,\r\n" + 
			"                \"customfield_16045\": null,\r\n" + 
			"                \"customfield_10061\": \"2018-05-25\",\r\n" + 
			"                \"customfield_16044\": null,\r\n" + 
			"                \"customfield_18341\": null,\r\n" + 
			"                \"customfield_16842\": null,\r\n" + 
			"                \"customfield_16841\": null,\r\n" + 
			"                \"customfield_10340\": \"9223372036854775807\",\r\n" + 
			"                \"customfield_16444\": null,\r\n" + 
			"                \"customfield_16840\": null,\r\n" + 
			"                \"customfield_18748\": \"Add any other requirements for the API that you might have, e.g. performance expectations: do you want the API to handle batch input? What is the latency you expect?\",\r\n" + 
			"                \"customfield_10220\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/customFieldOption/10140\",\r\n" + 
			"                    \"value\": \"default\",\r\n" + 
			"                    \"id\": \"10140\"\r\n" + 
			"                },\r\n" + 
			"                \"customfield_16443\": null,\r\n" + 
			"                \"priority\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/priority/3\",\r\n" + 
			"                    \"iconUrl\": \"https://sapjira.wdf.sap.corp/images/icons/priorities/major.svg\",\r\n" + 
			"                    \"name\": \"Medium\",\r\n" + 
			"                    \"id\": \"3\"\r\n" + 
			"                },\r\n" + 
			"                \"customfield_10221\": null,\r\n" + 
			"                \"customfield_10861\": null,\r\n" + 
			"                \"labels\": [],\r\n" + 
			"                \"customfield_14941\": null,\r\n" + 
			"                \"customfield_10852\": null,\r\n" + 
			"                \"customfield_10853\": null,\r\n" + 
			"                \"customfield_10854\": null,\r\n" + 
			"                \"customfield_10855\": null,\r\n" + 
			"                \"customfield_10856\": null,\r\n" + 
			"                \"aggregatetimeoriginalestimate\": null,\r\n" + 
			"                \"timeestimate\": null,\r\n" + 
			"                \"versions\": [],\r\n" + 
			"                \"issuelinks\": [],\r\n" + 
			"                \"assignee\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/user?username=i842320\",\r\n" + 
			"                    \"name\": \"i842320\",\r\n" + 
			"                    \"key\": \"i842320\",\r\n" + 
			"                    \"emailAddress\": \"clarence.chuahuico@sap.com\",\r\n" + 
			"                    \"avatarUrls\": {\r\n" + 
			"                        \"48x48\": \"https://sapjira.wdf.sap.corp/secure/useravatar?avatarId=10432\",\r\n" + 
			"                        \"24x24\": \"https://sapjira.wdf.sap.corp/secure/useravatar?size=small&avatarId=10432\",\r\n" + 
			"                        \"16x16\": \"https://sapjira.wdf.sap.corp/secure/useravatar?size=xsmall&avatarId=10432\",\r\n" + 
			"                        \"32x32\": \"https://sapjira.wdf.sap.corp/secure/useravatar?size=medium&avatarId=10432\"\r\n" + 
			"                    },\r\n" + 
			"                    \"displayName\": \"Chuahuico, Clarence(I842320)\",\r\n" + 
			"                    \"active\": true,\r\n" + 
			"                    \"timeZone\": \"America/Vancouver\"\r\n" + 
			"                },\r\n" + 
			"                \"status\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/status/10003\",\r\n" + 
			"                    \"description\": \"The Task is considered finished. Tasks which are closed can be reopened.\",\r\n" + 
			"                    \"iconUrl\": \"https://sapjira.wdf.sap.corp/images/icons/statuses/closed.png\",\r\n" + 
			"                    \"name\": \"Done\",\r\n" + 
			"                    \"id\": \"10003\",\r\n" + 
			"                    \"statusCategory\": {\r\n" + 
			"                        \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/statuscategory/3\",\r\n" + 
			"                        \"id\": 3,\r\n" + 
			"                        \"key\": \"done\",\r\n" + 
			"                        \"colorName\": \"green\",\r\n" + 
			"                        \"name\": \"Done\"\r\n" + 
			"                    }\r\n" + 
			"                },\r\n" + 
			"                \"components\": [],\r\n" + 
			"                \"customfield_10290\": null,\r\n" + 
			"                \"customfield_10291\": null,\r\n" + 
			"                \"customfield_15340\": null,\r\n" + 
			"                \"customfield_15741\": null,\r\n" + 
			"                \"customfield_11540\": null,\r\n" + 
			"                \"customfield_10210\": \"9223372036854775807\",\r\n" + 
			"                \"customfield_10850\": null,\r\n" + 
			"                \"customfield_10851\": null,\r\n" + 
			"                \"customfield_10842\": null,\r\n" + 
			"                \"customfield_10843\": null,\r\n" + 
			"                \"customfield_10844\": null,\r\n" + 
			"                \"customfield_10845\": null,\r\n" + 
			"                \"aggregatetimeestimate\": null,\r\n" + 
			"                \"customfield_10846\": null,\r\n" + 
			"                \"customfield_10847\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/customFieldOption/10960\",\r\n" + 
			"                    \"value\": \"Internal\",\r\n" + 
			"                    \"id\": \"10960\"\r\n" + 
			"                },\r\n" + 
			"                \"customfield_10848\": null,\r\n" + 
			"                \"customfield_10849\": null,\r\n" + 
			"                \"customfield_19140\": null,\r\n" + 
			"                \"customfield_16141\": null,\r\n" + 
			"                \"customfield_16140\": null,\r\n" + 
			"                \"customfield_18442\": null,\r\n" + 
			"                \"creator\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/user?username=i842320\",\r\n" + 
			"                    \"name\": \"i842320\",\r\n" + 
			"                    \"key\": \"i842320\",\r\n" + 
			"                    \"emailAddress\": \"clarence.chuahuico@sap.com\",\r\n" + 
			"                    \"avatarUrls\": {\r\n" + 
			"                        \"48x48\": \"https://sapjira.wdf.sap.corp/secure/useravatar?avatarId=10432\",\r\n" + 
			"                        \"24x24\": \"https://sapjira.wdf.sap.corp/secure/useravatar?size=small&avatarId=10432\",\r\n" + 
			"                        \"16x16\": \"https://sapjira.wdf.sap.corp/secure/useravatar?size=xsmall&avatarId=10432\",\r\n" + 
			"                        \"32x32\": \"https://sapjira.wdf.sap.corp/secure/useravatar?size=medium&avatarId=10432\"\r\n" + 
			"                    },\r\n" + 
			"                    \"displayName\": \"Chuahuico, Clarence(I842320)\",\r\n" + 
			"                    \"active\": true,\r\n" + 
			"                    \"timeZone\": \"America/Vancouver\"\r\n" + 
			"                },\r\n" + 
			"                \"customfield_18840\": null,\r\n" + 
			"                \"subtasks\": [],\r\n" + 
			"                \"customfield_10161\": null,\r\n" + 
			"                \"customfield_16941\": null,\r\n" + 
			"                \"customfield_16940\": null,\r\n" + 
			"                \"reporter\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/user?username=i842320\",\r\n" + 
			"                    \"name\": \"i842320\",\r\n" + 
			"                    \"key\": \"i842320\",\r\n" + 
			"                    \"emailAddress\": \"clarence.chuahuico@sap.com\",\r\n" + 
			"                    \"avatarUrls\": {\r\n" + 
			"                        \"48x48\": \"https://sapjira.wdf.sap.corp/secure/useravatar?avatarId=10432\",\r\n" + 
			"                        \"24x24\": \"https://sapjira.wdf.sap.corp/secure/useravatar?size=small&avatarId=10432\",\r\n" + 
			"                        \"16x16\": \"https://sapjira.wdf.sap.corp/secure/useravatar?size=xsmall&avatarId=10432\",\r\n" + 
			"                        \"32x32\": \"https://sapjira.wdf.sap.corp/secure/useravatar?size=medium&avatarId=10432\"\r\n" + 
			"                    },\r\n" + 
			"                    \"displayName\": \"Chuahuico, Clarence(I842320)\",\r\n" + 
			"                    \"active\": true,\r\n" + 
			"                    \"timeZone\": \"America/Vancouver\"\r\n" + 
			"                },\r\n" + 
			"                \"aggregateprogress\": {\r\n" + 
			"                    \"progress\": 0,\r\n" + 
			"                    \"total\": 0\r\n" + 
			"                },\r\n" + 
			"                \"customfield_12740\": null,\r\n" + 
			"                \"customfield_10038\": null,\r\n" + 
			"                \"customfield_15848\": null,\r\n" + 
			"                \"customfield_10039\": \"false\",\r\n" + 
			"                \"customfield_15846\": null,\r\n" + 
			"                \"customfield_15847\": null,\r\n" + 
			"                \"progress\": {\r\n" + 
			"                    \"progress\": 0,\r\n" + 
			"                    \"total\": 0\r\n" + 
			"                },\r\n" + 
			"                \"votes\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/issue/FPA46-436/votes\",\r\n" + 
			"                    \"votes\": 0,\r\n" + 
			"                    \"hasVoted\": false\r\n" + 
			"                },\r\n" + 
			"                \"issuetype\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/issuetype/5\",\r\n" + 
			"                    \"id\": \"5\",\r\n" + 
			"                    \"description\": \"Task\",\r\n" + 
			"                    \"iconUrl\": \"https://sapjira.wdf.sap.corp/secure/viewavatar?size=xsmall&avatarId=27826&avatarType=issuetype\",\r\n" + 
			"                    \"name\": \"Task\",\r\n" + 
			"                    \"subtask\": true,\r\n" + 
			"                    \"avatarId\": 27826\r\n" + 
			"                },\r\n" + 
			"                \"customfield_15440\": null,\r\n" + 
			"                \"customfield_15441\": null,\r\n" + 
			"                \"customfield_10270\": \"9223372036854775807\",\r\n" + 
			"                \"timespent\": null,\r\n" + 
			"                \"customfield_10150\": null,\r\n" + 
			"                \"customfield_10271\": \"9223372036854775807\",\r\n" + 
			"                \"customfield_15841\": null,\r\n" + 
			"                \"project\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/project/41665\",\r\n" + 
			"                    \"id\": \"41665\",\r\n" + 
			"                    \"key\": \"FPA46\",\r\n" + 
			"                    \"name\": \"FPA46 - App Building (Herbert)\",\r\n" + 
			"                    \"avatarUrls\": {\r\n" + 
			"                        \"48x48\": \"https://sapjira.wdf.sap.corp/secure/projectavatar?pid=41665&avatarId=10011\",\r\n" + 
			"                        \"24x24\": \"https://sapjira.wdf.sap.corp/secure/projectavatar?size=small&pid=41665&avatarId=10011\",\r\n" + 
			"                        \"16x16\": \"https://sapjira.wdf.sap.corp/secure/projectavatar?size=xsmall&pid=41665&avatarId=10011\",\r\n" + 
			"                        \"32x32\": \"https://sapjira.wdf.sap.corp/secure/projectavatar?size=medium&pid=41665&avatarId=10011\"\r\n" + 
			"                    }\r\n" + 
			"                },\r\n" + 
			"                \"customfield_15844\": null,\r\n" + 
			"                \"aggregatetimespent\": null,\r\n" + 
			"                \"customfield_11640\": null,\r\n" + 
			"                \"customfield_15845\": null,\r\n" + 
			"                \"customfield_10036\": null,\r\n" + 
			"                \"customfield_10037\": null,\r\n" + 
			"                \"customfield_15843\": null,\r\n" + 
			"                \"customfield_10941\": null,\r\n" + 
			"                \"customfield_10942\": null,\r\n" + 
			"                \"customfield_10943\": null,\r\n" + 
			"                \"customfield_10944\": null,\r\n" + 
			"                \"customfield_10945\": null,\r\n" + 
			"                \"customfield_10946\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/customFieldOption/11185\",\r\n" + 
			"                    \"value\": \"Not Set\",\r\n" + 
			"                    \"id\": \"11185\"\r\n" + 
			"                },\r\n" + 
			"                \"resolutiondate\": \"2018-06-26T23:12:54.000+0000\",\r\n" + 
			"                \"customfield_10947\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/customFieldOption/11190\",\r\n" + 
			"                    \"value\": \"Yes\",\r\n" + 
			"                    \"id\": \"11190\"\r\n" + 
			"                },\r\n" + 
			"                \"customfield_10948\": null,\r\n" + 
			"                \"workratio\": -1,\r\n" + 
			"                \"customfield_16240\": null,\r\n" + 
			"                \"watches\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/issue/FPA46-436/watchers\",\r\n" + 
			"                    \"watchCount\": 2,\r\n" + 
			"                    \"isWatching\": false\r\n" + 
			"                },\r\n" + 
			"                \"customfield_16640\": null,\r\n" + 
			"                \"created\": \"2018-05-25T00:46:34.000+0000\",\r\n" + 
			"                \"customfield_16241\": null,\r\n" + 
			"                \"customfield_18947\": null,\r\n" + 
			"                \"customfield_10300\": null,\r\n" + 
			"                \"updated\": \"2018-06-26T23:12:54.000+0000\",\r\n" + 
			"                \"customfield_15140\": null,\r\n" + 
			"                \"customfield_19740\": null,\r\n" + 
			"                \"customfield_15144\": \"1|hzbzyf:\",\r\n" + 
			"                \"timeoriginalestimate\": null,\r\n" + 
			"                \"customfield_11340\": null,\r\n" + 
			"                \"description\": null,\r\n" + 
			"                \"customfield_10130\": \"2018-05-25\",\r\n" + 
			"                \"customfield_15940\": null,\r\n" + 
			"                \"customfield_10013\": null,\r\n" + 
			"                \"customfield_10005\": null,\r\n" + 
			"                \"customfield_10248\": null,\r\n" + 
			"                \"summary\": \"Define async boundaries for viz control for different workflows\",\r\n" + 
			"                \"customfield_12140\": null,\r\n" + 
			"                \"customfield_16340\": null,\r\n" + 
			"                \"customfield_10120\": null,\r\n" + 
			"                \"customfield_10241\": null,\r\n" + 
			"                \"customfield_16740\": null,\r\n" + 
			"                \"customfield_10003\": {\r\n" + 
			"                    \"self\": \"https://sapjira.wdf.sap.corp/rest/api/2/customFieldOption/10010\",\r\n" + 
			"                    \"value\": \"Yes\",\r\n" + 
			"                    \"id\": \"10010\"\r\n" + 
			"                },\r\n" + 
			"                \"environment\": null,\r\n" + 
			"                \"duedate\": null\r\n" + 
			"            }\r\n" + 
			"        }\r\n" + 
			"    ]\r\n" + 
			"}";
	
}
