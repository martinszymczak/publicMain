package org.publicmain.common;

public enum MSGCode {
	NODE_UPDATE,
	ALIAS_UPDATE,
	
	ECHO_REQUEST,
	ECHO_RESPONSE,
	
	ROOT_DISCOVERY,
	ROOT_REPLY,
	
	POLL_CHILDNODES,
	REPORT_CHILDNODES,
	
	POLL_ALLNODES,
	REPORT_ALLNODES,
	
	NODE_SHUTDOWN,
	
	GROUP_POLL,
	GROUP_REPLY,
	GROUP_JOIN,
	GROUP_LEAVE,
	GROUP_EMPTY,
	
	FILE_REQUEST,
	
	CMD_SHUTDOWN,
	CMD_RESTART,
	
	CW_INFO_TEXT,
	CW_WARNING_TEXT,
	CW_ERROR_TEXT;
}
