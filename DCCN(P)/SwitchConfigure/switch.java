Step 1 : Setting hostname
enable
show running-config
exit
enable
configure terminal
hostname sw1
exit
exit

Step 2 : Print msg of the day
enable
configure terminal
banner motd "Hello GPREC"
exit
exit

Step 3 : Setting user mode 
enable
configure terminal
line con 0
password cse
exit
exit
exit

Step 4 : Setting privlaged mode 
enable
configure terminal
enable secret ecs
exit
exit

Step 5 : Checking switch configutarion
enable
password : cse
password : ecs
sh run
copy running-config startup-config
[enter]