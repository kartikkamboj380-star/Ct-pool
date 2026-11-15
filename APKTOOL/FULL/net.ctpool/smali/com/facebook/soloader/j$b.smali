.class final Lcom/facebook/soloader/j$b;
.super Lcom/facebook/soloader/C$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/soloader/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field final o:Ljava/io/File;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/facebook/soloader/C$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/facebook/soloader/j$b;->o:Ljava/io/File;

    return-void
.end method
