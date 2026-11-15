.class final Lu4/g$c;
.super Lcom/google/android/gms/common/api/internal/TaskApiCall;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu4/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field private final a:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0x3392

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {p0, v2, v0, v1}, Lcom/google/android/gms/common/api/internal/TaskApiCall;-><init>([Lcom/google/android/gms/common/Feature;ZI)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lu4/g$c;->a:Landroid/os/Bundle;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method protected a(Lu4/e;Lz3/m;)V
    .locals 1

    .line 1
    new-instance v0, Lu4/g$b;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Lu4/g$b;-><init>(Lz3/m;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lu4/g$c;->a:Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-virtual {p1, v0, p2}, Lu4/e;->d(Lu4/h$a;Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method protected bridge synthetic doExecute(Lcom/google/android/gms/common/api/Api$AnyClient;Lz3/m;)V
    .locals 0

    .line 1
    check-cast p1, Lu4/e;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lu4/g$c;->a(Lu4/e;Lz3/m;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
