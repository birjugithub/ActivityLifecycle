# Android Activity & Lifecycle

## ✅ What is Activity?
An **Activity** is a single screen in an Android application where the user can interact.

Example:
- Login Screen = Activity
- Home Screen = Activity

Activity is the **entry point** for user interaction in Android apps.

---

## ✅ Activity Lifecycle Methods (When they are called)

Android automatically calls lifecycle methods based on user actions like opening app, closing app, pressing home/back, rotation, etc.

---

## 🔥 1. onCreate()
📌 Called when Activity is created for the first time.

### Used for:
- `setContentView()`
- initialize UI components
- setup ViewModel
- API call setup

---

## 🔥 2. onStart()
📌 Called when Activity becomes visible to the user.

---

## 🔥 3. onResume()
📌 Called when Activity comes to foreground and user can interact.

### Used for:
- start camera/location
- start animations

---

## ✅ Activity is now in Running State

---

## 🔥 4. onPause()
📌 Called when Activity loses focus but still partially visible.

### Example:
- Incoming call
- Permission popup
- Dialog appears

### Used for:
- stop animations
- save small data

---

## 🔥 5. onStop()
📌 Called when Activity is no longer visible.

### Example:
- User pressed Home button
- Another Activity fully covers it

---

## 🔥 6. onRestart()
📌 Called when Activity comes back after being stopped.

### Example:
- User comes back from recent apps

---

## 🔥 7. onDestroy()
📌 Called when Activity is destroyed.

### Example:
- User presses back button
- Activity finished
- System kills activity due to memory

---

# ⭐ Activity Lifecycle Flow

## ▶️ When Activity starts:

onCreate()
onStart()
onResume()

## ▶️ When user presses Home:
onPause()
onStop()

## ▶️ When user comes back:
onRestart()
onStart()
onResume()

## ▶️ When user presses Back (finish Activity):
onPause()
onStop()
onDestroy()
