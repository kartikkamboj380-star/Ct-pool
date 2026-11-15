.class public final Lu4/j;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"

# interfaces
.implements Lt4/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu4/j$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lu4/j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final m:Landroid/net/Uri;

.field private final n:Landroid/net/Uri;

.field private final o:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lu4/k;

    .line 2
    .line 3
    invoke-direct {v0}, Lu4/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lu4/j;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Landroid/net/Uri;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu4/j;->m:Landroid/net/Uri;

    .line 5
    .line 6
    iput-object p2, p0, Lu4/j;->n:Landroid/net/Uri;

    .line 7
    .line 8
    if-nez p3, :cond_0

    .line 9
    .line 10
    new-instance p3, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    :cond_0
    iput-object p3, p0, Lu4/j;->o:Ljava/util/List;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public a0()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lu4/j;->o:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lu4/j;->m:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public w()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lu4/j;->n:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lu4/k;->c(Lu4/j;Landroid/os/Parcel;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
