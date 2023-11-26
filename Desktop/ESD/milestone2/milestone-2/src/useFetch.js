import { useEffect } from "react";
import { useState } from "react";
const useFetch = (url) => {

    const [data, setData] = useState(null);
    //initially make it null and update the state once you fetch data from db.json
    const [isLoading,setisLoading]= useState(true); //for conditional loading
    const [error,setError]= useState(null);
    //const [name,setName]=useState('sara')

    useEffect(() => {

      const abortCont = new AbortController();


        setTimeout(() => {
          fetch(url, { signal: abortCont.signal })
          .then(res => {
            console.log(res)
            if(!res.ok)
            {
                throw Error('error!!!')
            }
            return res.json();
          })
          .then(data => {    
            setisLoading(false);
            setData(data);
          })
          .catch(err => {
            if (err.name === 'AbortError') {
              console.log('fetch aborted')
            } else {
              // auto catches network / connection error
              setisLoading(false);
              setError(err.message);
            }
          })
        }, 1000);

      // abort the fetch
    return () => abortCont.abort();

      }, [url])  //re-run whenever url changes

      return {error,isLoading,data}
}

export default useFetch;
