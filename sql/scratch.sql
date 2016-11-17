SELECT table_schema "Data Base Name", sum( data_length + index_length ) / 1024 / 1024 "Data Base Size in MB" 
FROM information_schema.TABLES GROUP BY table_schema ; 


SELECT * FROM metro.TripStatus  order by id desc;
SELECT * FROM metro.TripStatus where activeTripId="1_32201661" order by id;
SELECT * FROM metro.TripStatus where lastLocationUpdateTime=1479270777000
SELECT * FROM metro.TripStatus where closestStopTimeOffset = 0 order by id;
SELECT closestStop FROM metro.TripStatus where closestStopTimeOffset = 0 order by id;
--

SELECT DISTINCT stops.stop_id, stops.stop_name
  FROM trips
  INNER JOIN stop_times ON stop_times.trip_id = trips.trip_id
  INNER JOIN stops ON stops.stop_id = stop_times.stop_id
  WHERE route_id = ;
/*
datetime, 
route/trip, 
traffic(0-1), lastHourTraffic(0-1), lastFourHourTraffic(0-1),
temp(0-1), lastHourTemp(0-1), lastFourHourTemp(0-1),
rain(0-1), lastHourRain(0-1), lastFourHourTemp(0-1),
  snow(0-1), lastHourSnow(0-1), lastFourHourTemp(0-1),
wind(0-1) lastHourWind(0-1), lastFourHourTemp(0-1),
holiday(0-1), futureHoliday(0-1), pastHoliday(0-1), futureHolidayThreeDays(0-1), pastHolidayThreeDays(0-1), 
prevBusBehind(0-1, .5 perfect), nextBusAhead(0-1, .5 perfect),
currentStop (maybe dist along trip?), futureStop (maybe dist along trip?), minutesToStop


drop table if exists metroInput;
CREATE TABLE `metro`.`metroInput` (
  id INT NOT NULL AUTO_INCREMENT,
  stopDate datetime NULL,
  currentStopId INT NULL,
  futureStopId INT NULL,
  minutesToStop TINYINT(4) NULL,
  traffic TINYINT(4) NULL,
  temp TINYINT(4) NULL,
  lastHourTemp TINYINT(4) NULL,
  lastFourHourTemp TINYINT(4) NULL,
  rain TINYINT(4) NULL,
  lastHourRain TINYINT(4) NULL,
  lastFourHourRain TINYINT(4) NULL,
  snow TINYINT(4) NULL,
  lastHourSnow TINYINT(4) NULL,
  lastFourHourSnow TINYINT(4) NULL,
  wind TINYINT(4) NULL,
  lastHourWind TINYINT(4) NULL,
  lastFourHourWind TINYINT(4) NULL,
  holiday TINYINT(4) NULL,
  futureHoliday TINYINT(4) NULL,
  pastHoliday TINYINT(4) NULL,
  futureHolidayThreeDays TINYINT(4) NULL,
  pastHolidayThreeDays TINYINT(4) NULL,
  prevBusBehind TINYINT(4) NULL,
  nextBusAhead TINYINT(4) NULL,
  PRIMARY KEY (`id`));
*/

SELECT * FROM metro.TripStatus  order by id desc;

SELECT * FROM metro.TripStatus  where activetripid='1_32186323';
