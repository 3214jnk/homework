const taskInput = document.getElementById('taskInput');
const addTaskBtn = document.getElementById('addTaskBtn');
const taskList = document.getElementById('taskList');
const errorMessage = document.getElementById('errorMessage');
const prioritySelect = document.getElementById('prioritySelect');
const totalCount = document.getElementById('totalCount');
const activeCount = document.getElementById('activeCount');
const completedCount = document.getElementById('completedCount');

let tasks = [];

const storageTasks = localStorage.getItem('tasks');
if (storageTasks) {
  tasks = JSON.parse(storageTasks); 
}

let currentFilter = 'all';

const filterBtns = document.querySelectorAll('.filter-btn');
filterBtns.forEach((btn) => {
  btn.addEventListener('click', (event) => {
    currentFilter = btn.dataset.filter;
    filterBtns.forEach((btn) => {
      btn.classList.remove('active');
    })
    event.target.classList.add('active');
    renderTasks();
  })
})

const clearCompletedBtn = document.getElementById('clearCompletedBtn')
clearCompletedBtn.addEventListener('click', () => {
  tasks = tasks.filter((task) => {
    return !task.completed;
  })
  renderTasks();
})

function renderTasks() {
  taskList.innerHTML = '';

  let filteredTasks = tasks;
  if (currentFilter === 'active') {
    filteredTasks = tasks.filter((task) => {
      return !task.completed;
    })
  } else if (currentFilter === 'completed') {
    filteredTasks = tasks.filter((task) => {
      return task.completed;
    })
  }
 
  filteredTasks.forEach((task) => {
    const li = document.createElement('li');
    li.classList.add('task-item')
    const completedBtn = document.createElement('button');
    completedBtn.textContent = '完了';

    completedBtn.addEventListener('click', () => {
      task.completed = !task.completed;
      renderTasks();
    })

    const deleteBtn = document.createElement('button');
    deleteBtn.textContent = '削除';

    deleteBtn.addEventListener('click', () => {
      tasks = tasks.filter((remainedTask) => {
        return remainedTask !== task;
      });
      renderTasks();
    })
    
    if (task.completed) {
      li.classList.add('completed');
      completedBtn.textContent = '未完了';
    }

    const title = document.createElement('span');
    title.textContent = task.text;
    title.classList.add('task-title');

    const priority = document.createElement('span');
    priority.textContent = '　優先度：' + task.priority;
    priority.classList.add('priority');

    const taskInfo = document.createElement('div');
    taskInfo.classList.add('task-info');
    taskInfo.appendChild(title);
    taskInfo.appendChild(priority);
    li.appendChild(taskInfo);

    const actions = document.createElement('div');
    actions.classList.add('actions');
    actions.appendChild(completedBtn);
    actions.appendChild(deleteBtn);
    li.appendChild(actions);

    taskList.appendChild(li);
  })

  updateCounts();

  saveTasks();
}

function addTask() {
  const taskText = taskInput.value.trim();

  if (taskText === '') {
    errorMessage.textContent = 'タスクを入力してください。';
    return;
  }

  const task = {
  text: taskText,
  completed: false,
  priority: prioritySelect.value
  };

  tasks.push(task);
    
  renderTasks();

  taskInput.value = '';
  errorMessage.textContent = '';
}

addTaskBtn.addEventListener('click', addTask);
taskInput.addEventListener('keydown', (event) => {
  if (event.key === 'Enter' && !event.isComposing) {
    addTask();
  }
})

function updateCounts() {
  const activeTasks = tasks.filter((task) => {
    return !task.completed;
  })
  const completedTasks = tasks.filter((task) => {
    return task.completed;
  })

  totalCount.textContent = tasks.length;
  activeCount.textContent = activeTasks.length;
  completedCount.textContent = completedTasks.length;
}

function saveTasks() {
  const jsonStringTasks = JSON.stringify(tasks);
  localStorage.setItem('tasks', jsonStringTasks);
}

renderTasks();