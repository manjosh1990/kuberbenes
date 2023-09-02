const apiUrl = "localhost";
const apiPort = "10443";
const joinUrl = (baseUrl, url) => {
  return `${baseUrl}/${url}`;
};
const domain = `http://${apiUrl}:${apiPort}/api/bookmarks`;

export async function getBookmarks(url = "") {
  url = joinUrl(domain, url);
  try {
    const res = await fetch(url);
    if (!res.ok) {
      throw Object.assign(new Error("Failed to fetch data"), {
        message: "Failed to fetch data",
        statusText: res.statusText,
        status: res.status,
      });
    }
    const data = await res.json();
    return data;
  } catch (err) {
    console.log(err);
      throw Object.assign(new Error("Failed to fetch data"), {
        message: "Failed to fetch data",
        statusText: err.statusText,
        status: err.status,
      });
    }
}
