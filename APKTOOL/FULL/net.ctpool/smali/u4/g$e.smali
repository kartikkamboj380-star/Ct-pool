.class final Lu4/g$e;
.super Lcom/google/android/gms/common/api/internal/TaskApiCall;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu4/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LD4/b;


# direct methods
.method constructor <init>(LD4/b;Ljava/lang/String;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0x3391

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {p0, v2, v0, v1}, Lcom/google/android/gms/common/api/internal/TaskApiCall;-><init>([Lcom/google/android/gms/common/Feature;ZI)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lu4/g$e;->a:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p1, p0, Lu4/g$e;->b:LD4/b;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method protected a(Lu4/e;Lz3/m;)V
    .locals 2

    .line 1
    new-instance v0, Lu4/g$d;

    .line 2
    .line 3
    iget-object v1, p0, Lu4/g$e;->b:LD4/b;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lu4/g$d;-><init>(LD4/b;Lz3/m;)V

    .line 6
    .line 7
    .line 8
    iget-object p2, p0, Lu4/g$e;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p1, v0, p2}, Lu4/e;->e(Lu4/h$a;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method protected bridge synthetic doExecute(Lcom/google/android/gms/common/api/Api$AnyClient;Lz3/m;)V
    .locals 0

    .line 1
    check-cast p1, Lu4/e;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lu4/g$e;->a(Lu4/e;Lz3/m;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
