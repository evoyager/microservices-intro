{{/*
Common labels
*/}}
{{- define "microservices-intro.labels" -}}
current-date: {{ now | date "2006-01-02" | quote }}
version: {{ .Chart.AppVersion | quote }}
{{- end }}
