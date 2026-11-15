.class public final Lcom/google/android/material/datepicker/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/datepicker/a$b;,
        Lcom/google/android/material/datepicker/a$c;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/material/datepicker/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final m:Lcom/google/android/material/datepicker/k;

.field private final n:Lcom/google/android/material/datepicker/k;

.field private final o:Lcom/google/android/material/datepicker/a$c;

.field private p:Lcom/google/android/material/datepicker/k;

.field private final q:I

.field private final r:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/material/datepicker/a$a;

    invoke-direct {v0}, Lcom/google/android/material/datepicker/a$a;-><init>()V

    sput-object v0, Lcom/google/android/material/datepicker/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/material/datepicker/k;Lcom/google/android/material/datepicker/k;Lcom/google/android/material/datepicker/a$c;Lcom/google/android/material/datepicker/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/datepicker/a;->m:Lcom/google/android/material/datepicker/k;

    iput-object p2, p0, Lcom/google/android/material/datepicker/a;->n:Lcom/google/android/material/datepicker/k;

    iput-object p4, p0, Lcom/google/android/material/datepicker/a;->p:Lcom/google/android/material/datepicker/k;

    iput-object p3, p0, Lcom/google/android/material/datepicker/a;->o:Lcom/google/android/material/datepicker/a$c;

    if-eqz p4, :cond_1

    invoke-virtual {p1, p4}, Lcom/google/android/material/datepicker/k;->e(Lcom/google/android/material/datepicker/k;)I

    move-result p3

    if-gtz p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "start Month cannot be after current Month"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-eqz p4, :cond_3

    invoke-virtual {p4, p2}, Lcom/google/android/material/datepicker/k;->e(Lcom/google/android/material/datepicker/k;)I

    move-result p3

    if-gtz p3, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "current Month cannot be after end Month"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    invoke-virtual {p1, p2}, Lcom/google/android/material/datepicker/k;->t(Lcom/google/android/material/datepicker/k;)I

    move-result p3

    add-int/lit8 p3, p3, 0x1

    iput p3, p0, Lcom/google/android/material/datepicker/a;->r:I

    iget p2, p2, Lcom/google/android/material/datepicker/k;->o:I

    iget p1, p1, Lcom/google/android/material/datepicker/k;->o:I

    sub-int/2addr p2, p1

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lcom/google/android/material/datepicker/a;->q:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/material/datepicker/k;Lcom/google/android/material/datepicker/k;Lcom/google/android/material/datepicker/a$c;Lcom/google/android/material/datepicker/k;Lcom/google/android/material/datepicker/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/material/datepicker/a;-><init>(Lcom/google/android/material/datepicker/k;Lcom/google/android/material/datepicker/k;Lcom/google/android/material/datepicker/a$c;Lcom/google/android/material/datepicker/k;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/material/datepicker/a;)Lcom/google/android/material/datepicker/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/datepicker/a;->m:Lcom/google/android/material/datepicker/k;

    return-object p0
.end method

.method static synthetic b(Lcom/google/android/material/datepicker/a;)Lcom/google/android/material/datepicker/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/datepicker/a;->n:Lcom/google/android/material/datepicker/k;

    return-object p0
.end method

.method static synthetic c(Lcom/google/android/material/datepicker/a;)Lcom/google/android/material/datepicker/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/datepicker/a;->p:Lcom/google/android/material/datepicker/k;

    return-object p0
.end method

.method static synthetic d(Lcom/google/android/material/datepicker/a;)Lcom/google/android/material/datepicker/a$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/datepicker/a;->o:Lcom/google/android/material/datepicker/a$c;

    return-object p0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e()Lcom/google/android/material/datepicker/a$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/a;->o:Lcom/google/android/material/datepicker/a$c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/material/datepicker/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/material/datepicker/a;

    iget-object v1, p0, Lcom/google/android/material/datepicker/a;->m:Lcom/google/android/material/datepicker/k;

    iget-object v3, p1, Lcom/google/android/material/datepicker/a;->m:Lcom/google/android/material/datepicker/k;

    invoke-virtual {v1, v3}, Lcom/google/android/material/datepicker/k;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/material/datepicker/a;->n:Lcom/google/android/material/datepicker/k;

    iget-object v3, p1, Lcom/google/android/material/datepicker/a;->n:Lcom/google/android/material/datepicker/k;

    invoke-virtual {v1, v3}, Lcom/google/android/material/datepicker/k;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/material/datepicker/a;->p:Lcom/google/android/material/datepicker/k;

    iget-object v3, p1, Lcom/google/android/material/datepicker/a;->p:Lcom/google/android/material/datepicker/k;

    invoke-static {v1, v3}, Landroidx/core/util/b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/material/datepicker/a;->o:Lcom/google/android/material/datepicker/a$c;

    iget-object p1, p1, Lcom/google/android/material/datepicker/a;->o:Lcom/google/android/material/datepicker/a$c;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method f()Lcom/google/android/material/datepicker/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/a;->n:Lcom/google/android/material/datepicker/k;

    return-object v0
.end method

.method g()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/datepicker/a;->r:I

    return v0
.end method

.method h()Lcom/google/android/material/datepicker/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/a;->p:Lcom/google/android/material/datepicker/k;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/google/android/material/datepicker/a;->m:Lcom/google/android/material/datepicker/k;

    iget-object v1, p0, Lcom/google/android/material/datepicker/a;->n:Lcom/google/android/material/datepicker/k;

    iget-object v2, p0, Lcom/google/android/material/datepicker/a;->p:Lcom/google/android/material/datepicker/k;

    iget-object v3, p0, Lcom/google/android/material/datepicker/a;->o:Lcom/google/android/material/datepicker/a$c;

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method i()Lcom/google/android/material/datepicker/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/a;->m:Lcom/google/android/material/datepicker/k;

    return-object v0
.end method

.method j()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/datepicker/a;->q:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object p2, p0, Lcom/google/android/material/datepicker/a;->m:Lcom/google/android/material/datepicker/k;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/google/android/material/datepicker/a;->n:Lcom/google/android/material/datepicker/k;

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/google/android/material/datepicker/a;->p:Lcom/google/android/material/datepicker/k;

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/google/android/material/datepicker/a;->o:Lcom/google/android/material/datepicker/a$c;

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
