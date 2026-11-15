.class public abstract Lcom/google/android/gms/internal/auth/Z;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/google/android/gms/internal/auth/U;)Lcom/google/android/gms/internal/auth/U;
    .locals 1

    .line 1
    instance-of v0, p0, Lcom/google/android/gms/internal/auth/X;

    if-nez v0, :cond_2

    instance-of v0, p0, Lcom/google/android/gms/internal/auth/V;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p0, Ljava/io/Serializable;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/auth/V;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/auth/V;-><init>(Lcom/google/android/gms/internal/auth/U;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/auth/X;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/auth/X;-><init>(Lcom/google/android/gms/internal/auth/U;)V

    :goto_0
    return-object v0

    :cond_2
    :goto_1
    return-object p0
.end method

.method public static b(Ljava/lang/Object;)Lcom/google/android/gms/internal/auth/U;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/auth/Y;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/auth/Y;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
