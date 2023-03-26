import React, { useState, useEffect } from 'react';
import axios from 'axios';

function Contato() {
  const [data, setData] = useState([]);

  useEffect(() => {
    const fetchData = async () => {
      const result = await axios(
        'http://localhost:8080/agenda',
      );

      setData(result.data);
    };

    fetchData();
  }, []);

  return (
    <div>
      
      <ul>
        {data.map(user => (
          <li>
             {user.nome} {user.telefone} {user.email} {user.cep}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default Contato;