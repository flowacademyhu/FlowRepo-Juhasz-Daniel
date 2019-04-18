#!/bin/bash
java DbGenerator.java >> /tmp/sql_inserts.sql
sudo -i -u postgres
# docker exec -it some