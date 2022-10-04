# CrossRAT Malware
This repository contains a JADX decompilation of the CrossRAT jar file that is used by the threat group Dark Caracal, to infect Windows, macOS and Linux users. Initial decompilation was conducted on a Ubuntu 22.04 machine using the Jadx-GUI tool. 

## Dark Caracal 
Dark Caracal designated as G0070 by Mitre, is a threat group that has been attributed to a Lebanese intelligence agency. Dark Caracal uses this custom made RAT written in Java for attacking its victims typically through having the user run a malicious document file. Dark Caracal also has conducted a large Android malware campaign by using a suite a trojanized applications, this malware is known as Pallas. 

# About
The repository serves as repo for analyzing the CrossRAT jar based on previous analysis listed below. 

# Findings 
TODO once more analysis is done.

# Resources 
For CrossRAT samples and in depth analysis check out: [JAMF Blog: Analyzing CrossRAT](https://www.jamf.com/blog/analyzing-crossrat/)

To download a version of Jadx check out: [skylot/jadx](https://github.com/skylot/jadx)

For more information on the Dark Caracal group check out: [Dark Caracal, Cyber-Espionage at a Global Scale](https://info.lookout.com/rs/051-ESQ-475/images/Lookout_Dark-Caracal_srr_20180118_us_v.1.0.pdf)

# Disclaimer
This repository contains code that if compiled could be malicious. Although some sanitization has been done (such as modifying C2 url's), proceed with caution when working and compiling the source files. 
