import './App.css';
import Contato from './components/contato/Contato';

function App() {
  return (
    <div className="App">
      <header>
        <h1>Agenda</h1>
        <h2> Contatos Cadastrados </h2>
      </header>
      <br/>
      <Contato/>
    </div>
  );
}

export default App;
