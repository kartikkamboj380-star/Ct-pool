.class final Lcom/google/android/gms/internal/measurement/C5;
.super Lcom/google/android/gms/internal/measurement/D5;
.source "SourceFile"


# instance fields
.field private final synthetic n:Lcom/google/android/gms/internal/measurement/w5;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/measurement/w5;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/C5;->n:Lcom/google/android/gms/internal/measurement/w5;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/D5;-><init>(Lcom/google/android/gms/internal/measurement/w5;Lcom/google/android/gms/internal/measurement/F5;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/w5;Lcom/google/android/gms/internal/measurement/F5;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/C5;-><init>(Lcom/google/android/gms/internal/measurement/w5;)V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/measurement/y5;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/C5;->n:Lcom/google/android/gms/internal/measurement/w5;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/y5;-><init>(Lcom/google/android/gms/internal/measurement/w5;Lcom/google/android/gms/internal/measurement/F5;)V

    return-object v0
.end method
