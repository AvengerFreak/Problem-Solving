'''
Given a valid IPv4 address, return a defanged version. If a nonvalid IP address is provided, return "Not in format"

Defanged would replace each “.” with “[.]”

Examples:
Input: 10.10.10.10
Output: 10[.]10[.]10[.]10

Input: 256.-1.16.78
Output: Not in format
'''

import re

def defang_ip(ip):

    if re.compile(r'(\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3})').search(ip) == None:
        return 'Not in format'

    return ip.replace(".", "[.]")


print(defang_ip("10.10.10.10"))