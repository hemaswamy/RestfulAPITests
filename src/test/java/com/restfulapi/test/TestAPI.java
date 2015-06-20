package com.restfulapi.test;

import javax.ws.rs.core.MediaType;

import org.junit.Test;

import com.restfulapi.http.fluent.APIRequest;

public class TestAPI {

	private String URL = "https://dram-dev2.hpconnecteddev.com/deviceregmgmt/services/deviceregmgmt/users/devices/8bc530c6b387a9ee5a7368daf108143071f92d1c3f35a60a229eba41210db088/deviceId=68480";
	
	private String token = "Y2I4YTIzMGFjZTFmZmNlNWEwZTQ1OGQyYTM3NGFjOWIzZjI3MTA2YmRkMTM5ZmMxMjIzZGU1NDk1NjE2NzNkNDoxMTI3YmQ3YTZlNzYxMDJkOTJiMDEyMzEzZGVkcDZjZDpFUEM6MTQzNDQ0NDE0OTEzMzoxNDM3OTAwMTQ5MTMzOjQ6ZmFsc2U6cmt5d2Q3d2ZHWkl5UGoyamtqWEppQjY4VE1nWkx2Sm1JVDlyWDZHTlB3UHRubUNXUXlGQjhyMU1EMnd0YjlLYU5USkwrVVlpZkVvUWFuQUpIUkt4ei9xSjlsTTlTaWc3SVJ4SXVmSUlGaWJaTUE3ellTRjNyWHJaMFBZNE9tRXRST1p5WGtwWEhUYVJ6bkxPbStnUFYxZ0VSYldsb0ZKUTVsTVF3ZDBjMTJjMnZBSmpmNnBhc3FNUjlKa2ZRTCtZdUpRbThCZ3FhWjdxOHllM1k2U3J6YjRLWTRXQ3lJbUhPODNzSVpBTWhLRVVxOTFzZWVkOWJ2NW1OL0swR05ZSUF2KzBnTGNWNUxIN1ZUcVlXS0NSelJBNG1OeitueDRuRWVmZEtoYmZJblRna2VKRFBNc0o4bVdnRFNzbzZMaUtrQVZTdzJyNXZTVGs1T0ZqMHE1RVhBPT0===";
	
	private String body = "";
	
	@Test
	public void test_GetRequest()
	{
		String token = "bnVsbDoxMTI3YmQ3YTZlNzYxMDJkOTJiMDEyMzEzZHBkYTZtZDpQQU06MTQzNDc4ODQzOTY1MToxNDM4MjQ0NDM5NjUxOjI6ZmFsc2U6SnROQnRhVDNvNVp0dzdqd2xvMkM0TFpsSEZzQlkrb0xWRm5rY0Q2WVUwbmNPc1J1SVNvcExnb0VzV2NoRkY5OUd6bk1ha1JEYTVLWFVBbVZNeEQ3YklTVStIV2doay9mNFZvUjJsS2FTUlBQZU9KNVFzdDFYdjBKTEs4bDJtbGhFWWR6UmJDcmt6K3l1eTJnNCtwVDByM1BleG1MYVlzaUtUangwSHladWlCTTZwNzRHcS9tWkxqLysxRk9xRGliNEpkcGo2TUc1YVZPSzkyWWh0cGlzR0hoa1lPWnFkbFA0dUVUZ0hEZ2dWQVgwU1QxdkdVTmhORG1mQ0o5RWVnM2R6U0UrTFU0V2NHRWw1TE9hb0xyaGs2NTF0V3VwYlExT1RlSDV3VWtLY1ZTblltT1hyWm9JaWg1QnRrdHMvTFNPSnFEN2JvSkJ4YnhuRzM5TXFkTXJRPT0=";
		APIRequest.GET(URL).header("Authorization", "Bearer " + token).invoke().assertStatus(200);
	}
	
	@Test
	public void test_SendPutRequest()
	{
		APIRequest.PUT("https://pam-dev2.hpconnecteddev.com/pam/services/pam/users/credential/userId=cb8a230ace1ffce5a0e458d2a374ac9b3f27106bdd139fc1223de549561673d4")
		.type(MediaType.APPLICATION_XML_TYPE).header("Authorization", "Bearer " + token ).body(body).invoke();
	}
}
