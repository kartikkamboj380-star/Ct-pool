.class public abstract Lh3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static varargs a([Ljava/lang/String;)Lcom/google/android/gms/common/logging/Logger;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/common/logging/Logger;

    .line 2
    .line 3
    const-string v1, "Auth"

    .line 4
    .line 5
    invoke-direct {v0, v1, p0}, Lcom/google/android/gms/common/logging/Logger;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
