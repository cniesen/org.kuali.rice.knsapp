<%--
  ~ Copyright 2006-2012 The Kuali Foundation
  ~
  ~ Licensed under the Educational Community License, Version 2.0 (the "License");
  ~ you may not use this file except in compliance with the License.
  ~ You may obtain a copy of the License at
  ~
  ~ http://www.opensource.org/licenses/ecl2.php
  ~
  ~ Unless required by applicable law or agreed to in writing, software
  ~ distributed under the License is distributed on an "AS IS" BASIS,
  ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  ~ See the License for the specific language governing permissions and
  ~ limitations under the License.
  --%>

<%--
Kuali Rice ArcheType Help

This file contains custom application specific portal content.
--%>

<%@ include file="/rice-portal/jsp/sys/riceTldHeader.jsp" %>

<channel:portalChannelTop channelTitle="knsapp"/>
<div class="body">

  <ul class="chan">
      <li>insert custom content here</li>
      <li><portal:portalLink displayTitle="true" title="Country" url="${ConfigProperties.kr.url}/lookup.do?methodToCall=start&businessObjectClassName=org.kuali.rice.knsapp.Country&docFormKey=88888888&returnLocation=${ConfigProperties.application.url}/portal.do&hideReturnLink=true" /></li>
      <li><portal:portalLink displayTitle="true" title="State" url="${ConfigProperties.kr.url}/lookup.do?methodToCall=start&businessObjectClassName=org.kuali.rice.knsapp.State&docFormKey=88888888&returnLocation=${ConfigProperties.application.url}/portal.do&hideReturnLink=true" /></li>
      <li><portal:portalLink displayTitle="true" title="State-QuickfinderDisabled" url="${ConfigProperties.kr.url}/lookup.do?methodToCall=start&businessObjectClassName=org.kuali.rice.knsapp.StateQuickfinderDisabled&docFormKey=88888888&returnLocation=${ConfigProperties.application.url}/portal.do&hideReturnLink=true" /></li>
      <li><portal:portalLink displayTitle="true" title="State-CriteriaFooter" url="${ConfigProperties.kr.url}/lookup.do?methodToCall=start&businessObjectClassName=org.kuali.rice.knsapp.StateCriteriaFooter&docFormKey=88888888&returnLocation=${ConfigProperties.application.url}/portal.do&hideReturnLink=true" /></li>
      <li><portal:portalLink displayTitle="true" title="State-NoSearchButtons" url="${ConfigProperties.kr.url}/lookup.do?methodToCall=start&businessObjectClassName=org.kuali.rice.knsapp.StateNoSearchButtons&docFormKey=88888888&returnLocation=${ConfigProperties.application.url}/portal.do&hideReturnLink=true" /></li>
      <li><portal:portalLink displayTitle="true" title="State-MultipleColumnsCriteria" url="${ConfigProperties.kr.url}/lookup.do?methodToCall=start&businessObjectClassName=org.kuali.rice.knsapp.StateMultipleColumnsCriteria&docFormKey=88888888&returnLocation=${ConfigProperties.application.url}/portal.do&hideReturnLink=true" /></li>
      <li><portal:portalLink displayTitle="true" title="State-DisabledWildcards" url="${ConfigProperties.kr.url}/lookup.do?methodToCall=start&businessObjectClassName=org.kuali.rice.knsapp.StateDisabledWildcards&docFormKey=88888888&returnLocation=${ConfigProperties.application.url}/portal.do&hideReturnLink=true" /></li>
  </ul>

</div>
<channel:portalChannelBottom/>
