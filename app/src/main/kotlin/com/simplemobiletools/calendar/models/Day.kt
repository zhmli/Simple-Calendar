package com.simplemobiletools.calendar.models

class Day(val value: Int, val isThisMonth: Boolean, val isToday: Boolean, val code: String, val hasEvent: Boolean, val weekOfYear: Int) {
    override fun toString(): String {
        return "Day {value=$value, isThisMonth=$isThisMonth, itToday=$isToday, code=$code, hasEvent=$hasEvent, weekOfYear=$weekOfYear}"
    }
}
